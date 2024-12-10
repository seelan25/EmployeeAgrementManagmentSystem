package com.example.gorai.technology.solution.customerRepo;

import com.example.gorai.technology.solution.dao.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, String> {
    // No additional methods needed for basic CRUD operations.
}
