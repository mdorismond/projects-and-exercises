package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CandyTest {

    private Candy candy;
    private String slotLocation;
    private String itemName;
    private BigDecimal itemPrice;

    @Before
    public void setup() {
        slotLocation = "B1";
        itemName = "Moonpie";
        itemPrice = new BigDecimal("1.80");
        candy = new Candy(slotLocation, itemName, itemPrice);
    }

    @Test
    public void displayCandyVendingMessage() {

        String actual = candy.displayMessage();
        String expected = "Munch Munch, Yum!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryInStock() {

        int stockAvailable = 1;
        candy.setInventoryAvailable(stockAvailable);

        String actual = candy.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f Available: %s", slotLocation, itemName, itemPrice, stockAvailable);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryOutOfStock() {
        int stockAvailable = 0;
        candy.setInventoryAvailable(0);

        String actual = candy.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f SOLD OUT", slotLocation, itemName, itemPrice);

        Assert.assertEquals(expected, actual);
    }
}
