package com.techelevator.Items;

import com.techelevator.Vendable;

import java.math.BigDecimal;

public abstract class VendingItems {

    private String name = "";
    private BigDecimal price;
    private int inventoryAvailable;
    private String slotLocation;

    public String displayMessage() {
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }

    public int getInventoryAvailable() {
        return inventoryAvailable;
    }

    public void setInventoryAvailable(int inventoryAvailable) {
        this.inventoryAvailable = inventoryAvailable;
    }

    public String getSlotLocation() {
        return slotLocation;
    }

    public void setSlotLocation(String slotLocation) {
        this.slotLocation = slotLocation;
    }

    public VendingItems(String slotLocation, String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.slotLocation = slotLocation;
    }

    public String getDisplayString() {
        if (inventoryAvailable == 0) {
            return String.format("%s %-20s $%4.2f SOLD OUT", slotLocation, name, price);
        } else {
            return String.format("%s %-20s $%4.2f Available: %s", slotLocation, name, price, inventoryAvailable);
        }
    }


}
