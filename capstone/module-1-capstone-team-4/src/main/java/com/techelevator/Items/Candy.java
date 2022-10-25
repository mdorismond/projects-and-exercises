package com.techelevator.Items;

import com.techelevator.Vendable;

import java.math.BigDecimal;

public class Candy extends VendingItems {

    public Candy(String slotLocation, String name, BigDecimal price) {
        super(slotLocation, name, price);
    }

    //@Override
    //public void sell() {

    //}

    @Override
    public String displayMessage() {
        return "Munch Munch, Yum!";
    }
}
