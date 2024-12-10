package com.example.gorai.technology.solution.customercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gorai.technology.solution.customerservice.CustomerService;
import com.example.gorai.technology.solution.dao.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    public CustomerService customerService;

    @PostMapping(path = "/save")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer); // Return the entire customer
    }

    @GetMapping(path = "/getAllCustomer")
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @PostMapping(path = "/update")
    public String updateCustomer(@RequestBody Customer customerUpdateDTO) {
        return customerService.updateCustomers(customerUpdateDTO);
    }

    @DeleteMapping(path = "/delete-customer/{id}")
    public boolean deleteCustomer(@PathVariable(value = "id") String id) {
        return customerService.deleteCustomer(id);
    }
}
