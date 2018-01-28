package science.wasabi.example.spring.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import science.wasabi.example.spring.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}

