package com.techelevator.model;

public class Vehicle {
    private int id;
    private String name;
    private int price;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model{" + "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + '}';
    }
}
