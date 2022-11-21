package com.techelevator.model;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + id +
                ", name='" + name + '\'' + ", address='" + address + '\'' +
                ", phone='" + phone + '\'' + ", email='" + email + '\'' + '}';
    }
}
