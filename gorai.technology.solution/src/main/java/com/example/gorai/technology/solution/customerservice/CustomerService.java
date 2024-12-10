package com.example.gorai.technology.solution.customerservice;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gorai.technology.solution.customerRepo.CustomerRepo;
import com.example.gorai.technology.solution.dao.Customer;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer addCustomer(Customer customerSaveDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerSaveDTO, customer);
        return customerRepo.save(customer); // Return the saved customer
    }

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }

    public String updateCustomers(Customer customerUpdateDTO) {
        if (customerRepo.existsById(customerUpdateDTO.getId())) {
            Customer customer = customerRepo.findById(customerUpdateDTO.getId()).orElse(null);
            if (customer != null) {
                customer.setEmployeeName(customerUpdateDTO.getEmployeeName());
                customer.setRole(customerUpdateDTO.getRole());
                customer.setStartDate(customerUpdateDTO.getStartDate());
                customer.setEndDate(customerUpdateDTO.getEndDate());
                customer.setSalary(customerUpdateDTO.getSalary());
                customer.setTerm(customerUpdateDTO.getTerm());
                customer.setOtherDetail(customerUpdateDTO.getOtherDetail());
                customer.setDepartment(customerUpdateDTO.getDepartment());
                customer.setManager(customerUpdateDTO.getManager());
                customerRepo.save(customer);
                return "Customer updated successfully!";
            }
        } else {
            System.out.println("Customer ID does not exist");
        }
        return "Failed to update customer";
    }

    public boolean deleteCustomer(String id) {
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
            return true;
        }
        return false;
    }
}
