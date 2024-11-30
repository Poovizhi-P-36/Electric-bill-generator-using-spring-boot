package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "electric_bills")
public class ElectricBill {

    @Id
    private String id;
    private String customerName;
    private String customerId;
    private double unitsConsumed;
    private double unitRate;
    private double totalAmount;

    // Constructor
    public ElectricBill(String customerName, String customerId, double unitsConsumed, double unitRate) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.unitsConsumed = unitsConsumed;
        this.unitRate = unitRate;
        this.totalAmount = unitsConsumed * unitRate;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double getUnitRate() {
        return unitRate;
    }

    public void setUnitRate(double unitRate) {
        this.unitRate = unitRate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
