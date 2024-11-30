package com.example.demo.service;

import com.example.demo.model.ElectricBill;
import com.example.demo.repository.ElectricBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectricBillService {

    @Autowired
    private ElectricBillRepository electricBillRepository;

    // Method to generate the electric bill
    public ElectricBill generateBill(ElectricBill electricBill) {
        electricBill.setTotalAmount(electricBill.getUnitsConsumed() * electricBill.getUnitRate()); // Calculate the amount
        return electricBillRepository.save(electricBill); // Save the bill to the DB
    }

    // Method to get all electric bills
    public List<ElectricBill> getAllBills() {
        return electricBillRepository.findAll();
    }

    // Method to get bill by customer ID
    public ElectricBill getBillByCustomerId(String customerId) {
        return electricBillRepository.findByCustomerId(customerId);
    }
}
