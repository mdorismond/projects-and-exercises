package com.techelevator.model;

import java.time.LocalDate;

public class Purchase {
    private int purchaseId;
    private int customerId;
    private int vehicleId;
    private LocalDate purchaseDate;
    private int numOfVehicle;
    private Vehicle vehicle;
    private Customer customer;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getNumOfVehicle() {
        return numOfVehicle;
    }

    public void setNumOfVehicle(int numOfVehicle) {
        this.numOfVehicle = numOfVehicle;
    }

    @Override
    public String toString() {
        return "Purchase { " + "purchaseId=" + purchaseId + ", customer name: " + customer.getName() +
                ", customerId=" + customerId + ", vehicle name: " + vehicle.getName() +
                ", vehicleId=" + vehicleId + ", price per vehicle: " + vehicle.getPrice() +
                ", purchaseDate=" + purchaseDate + ", number of vehicles=" + numOfVehicle + '}';
    }

}
