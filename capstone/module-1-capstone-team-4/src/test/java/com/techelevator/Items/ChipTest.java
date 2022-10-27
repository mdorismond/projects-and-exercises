package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ChipTest {

    private Chip chip;
    private String slotLocation;
    private String itemName;
    private BigDecimal itemPrice;

    @Before
    public void setup() {
        slotLocation = "A1";
        itemName = "Potato Crisps";
        itemPrice = new BigDecimal("3.05");
        chip = new Chip(slotLocation, itemName, itemPrice);
    }

    @Test
    public void displayChipVendingMessage() {

        String actual = chip.displayMessage();
        String expected = "Crunch Crunch, Yum!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryInStock() {

        int stockAvailable = 1;
        chip.setInventoryAvailable(stockAvailable);

        String actual = chip.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f Available: %s", slotLocation, itemName, itemPrice, stockAvailable);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryOutOfStock() {

        int stockAvailable = 0;
        chip.setInventoryAvailable(0);

        String actual = chip.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f SOLD OUT", slotLocation, itemName, itemPrice);

        Assert.assertEquals(expected, actual);
    }
}
