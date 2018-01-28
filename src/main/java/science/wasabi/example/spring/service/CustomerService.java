package science.wasabi.example.spring.service;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import science.wasabi.example.spring.entity.Customer;
import science.wasabi.example.spring.repository.CustomerRepository;


@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final Random random = new Random(System.currentTimeMillis());

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findRandom() {
        Iterable<Customer> all = customerRepository.findAll();
        List<Customer> customers = iteratorToList(all);

        return chooseRandom(customers);
    }

    private <T> List<T> iteratorToList(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
    }

    private <T> T chooseRandom(List<T> collection) {
        int choice = random.nextInt(collection.size());
        return collection.get(choice);
    }
}
