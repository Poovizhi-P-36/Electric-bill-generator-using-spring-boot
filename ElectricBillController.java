package com.example.demo.controller;

import com.example.demo.model.ElectricBill;
import com.example.demo.service.ElectricBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class ElectricBillController {

    @Autowired
    private ElectricBillService electricBillService;

    // Endpoint to generate an electric bill
    @PostMapping("/generate")
    public ElectricBill generateBill(@RequestBody ElectricBill electricBill) {
        return electricBillService.generateBill(electricBill);
    }

    // Endpoint to retrieve all electric bills
    @GetMapping("/all")
    public List<ElectricBill> getAllBills() {
        return electricBillService.getAllBills();
    }

    // Endpoint to retrieve bill by customer ID
    @GetMapping("/{customerId}")
    public ElectricBill getBillByCustomerId(@PathVariable String customerId) {
        return electricBillService.getBillByCustomerId(customerId);
    }
}
