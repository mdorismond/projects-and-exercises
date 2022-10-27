package com.techelevator.Items;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class DrinkTest {

    private Drink drink;
    private String slotLocation;
    private String itemName;
    private BigDecimal itemPrice;

    @Before
    public void setup() {
        slotLocation = "C1";
        itemName = "Cola";
        itemPrice = new BigDecimal("1.25");
        drink = new Drink(slotLocation, itemName, itemPrice);
    }

    @Test
    public void displayDrinkVendingMessage() {

        String actual = drink.displayMessage();
        String expected = "Glug Glug, Yum!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryInStock() {

        int stockAvailable = 1;
        drink.setInventoryAvailable(stockAvailable);

        String actual = drink.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f Available: %s", slotLocation, itemName, itemPrice, stockAvailable);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void returnDisplayStringWithInventoryOutOfStock() {

        int stockAvailable = 0;
        drink.setInventoryAvailable(0);

        String actual = drink.getDisplayString();
        String expected = String.format("%s %-20s $%4.2f SOLD OUT", slotLocation, itemName, itemPrice);

        Assert.assertEquals(expected, actual);
    }
}
