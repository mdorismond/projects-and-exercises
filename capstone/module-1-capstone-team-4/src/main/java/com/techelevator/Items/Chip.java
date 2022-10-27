package com.techelevator.Items;

import com.techelevator.Vendable;

import java.math.BigDecimal;

public class Chip extends VendingItems  {

    public Chip(String slotLocation, String name, BigDecimal price) {
        super(slotLocation, name, price);
    }

   // @Override
  //  public void sell() {

   // }

    @Override
    public String displayMessage() {
        return "Crunch Crunch, Yum!";
    }
}
