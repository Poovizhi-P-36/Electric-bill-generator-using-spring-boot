package com.example.demo.repository;

import com.example.demo.model.ElectricBill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricBillRepository extends MongoRepository<ElectricBill, String> {
    ElectricBill findByCustomerId(String customerId);
}
