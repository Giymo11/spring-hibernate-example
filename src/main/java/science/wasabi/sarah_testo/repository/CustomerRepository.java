package science.wasabi.sarah_testo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import science.wasabi.sarah_testo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}

