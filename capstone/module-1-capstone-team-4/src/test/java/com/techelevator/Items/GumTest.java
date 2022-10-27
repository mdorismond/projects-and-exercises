package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class GumTest {

    private Gum gum;
    private String slotLocation;
    private String itemName;
    private BigDecimal itemPrice;

    @Before
    public void setup() {
        slotLocation = "D1";
        itemName = "U-Chews";
        itemPrice = new BigDecimal("0.85");
        gum = new Gum(slotLocation, itemName, itemPrice);
    }

    @Test
    public void displayGumVendingMessage() {

        String actual = gum.displayMessage();
        String expected = "Chew Chew, Yum!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryInStock() {

        int stockAvailable = 1;
        gum.setInventoryAvailable(stockAvailable);

        String actual = gum.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f Available: %s", slotLocation, itemName, itemPrice, stockAvailable);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryOutOfStock() {

        int stockAvailable = 0;
        gum.setInventoryAvailable(0);

        String actual = gum.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f SOLD OUT", slotLocation, itemName, itemPrice);

        Assert.assertEquals(expected, actual);
    }
}
