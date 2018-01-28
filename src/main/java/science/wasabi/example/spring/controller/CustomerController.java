package science.wasabi.example.spring.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import science.wasabi.example.spring.entity.Customer;
import science.wasabi.example.spring.service.CustomerService;


@Controller
public class CustomerController {

    private final CustomerService customerService;

    @FXML private Label greeting;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void showGreeting(ActionEvent actionEvent) {
        Customer customer = customerService.findRandom();
        greeting.setText("Hello " + customer.getFirstName() + " " + customer.getLastName());
    }
}
