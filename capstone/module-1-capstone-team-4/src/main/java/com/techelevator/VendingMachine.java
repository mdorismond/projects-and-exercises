package com.techelevator;

import com.techelevator.Items.*;
import com.techelevator.view.Menu;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;
import java.util.List;

import static java.awt.SystemColor.menu;

public class VendingMachine {

    private List<VendingItems> vendables = new ArrayList<>();
    private Map<String, Integer> salesReport = new HashMap<>();
    private BigDecimal userBalance;
    private BigDecimal totalSales;
    private final int MAXIMUM_STOCK_AMOUNT = 5;
    private Logger logger = new Logger();

    public List<VendingItems> getVendables() {
        return vendables;
    }

    public void setVendables(List<VendingItems> vendables) {
        this.vendables = vendables;
    }

    public BigDecimal getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    public VendingMachine() {
        logger.createLogFile();
        this.userBalance = new BigDecimal("0.00");
        this.totalSales = new BigDecimal("0.00");
    }

    public void getInventory() {
        File inventoryFile = new File("vendingmachine.csv");

        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine()) {
                String lineItem = fileScanner.nextLine();
                String[] lineItems = lineItem.split("\\|");

                if (lineItems[lineItems.length - 1].equals("Chip")) {

                    String slotLocation = lineItems[0];
                    String itemName = lineItems[1];
                    BigDecimal itemPrice = new BigDecimal(lineItems[2]);
                    Chip chip = new Chip(slotLocation, itemName, itemPrice);
                    vendables.add(chip);
                    salesReport.put(itemName, 0);

                } else if (lineItems[lineItems.length - 1].equals("Candy")) {

                    String slotLocation = lineItems[0];
                    String itemName = lineItems[1];
                    BigDecimal itemPrice = new BigDecimal(lineItems[2]);
                    Candy candy = new Candy(slotLocation, itemName, itemPrice);
                    vendables.add(candy);
                    salesReport.put(itemName, 0);

                } else if (lineItems[lineItems.length - 1].equals("Drink")) {

                    String slotLocation = lineItems[0];
                    String itemName = lineItems[1];
                    BigDecimal itemPrice = new BigDecimal(lineItems[2]);
                    Drink drink = new Drink(slotLocation, itemName, itemPrice);
                    vendables.add(drink);
                    salesReport.put(itemName, 0);

                } else if (lineItems[lineItems.length - 1].equals("Gum")) {

                    String slotLocation = lineItems[0];
                    String itemName = lineItems[1];
                    BigDecimal itemPrice = new BigDecimal(lineItems[2]);
                    Gum gum = new Gum(slotLocation, itemName, itemPrice);
                    vendables.add(gum);
                    salesReport.put(itemName, 0);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Unable to find inventory file: " + inventoryFile.getAbsolutePath());
        }
    }

    public void restockInventory() {
        for (VendingItems item : vendables) {
            item.setInventoryAvailable(MAXIMUM_STOCK_AMOUNT);
        }
    }

    public void depositMoney(BigDecimal userMoney) {
        //update userBalance to inputted deposit amount
        userBalance = userBalance.add(userMoney);
        System.out.printf("You entered $%4.2f - Current Balance: $%4.2f\n", userMoney.doubleValue(), userBalance.doubleValue());
        logger.writeToLog("FEED MONEY:", userMoney, userBalance);
    }

    public VendingItems getVendableBySlotChoice(String slotChoice) {
        for (VendingItems vendingItems : vendables) {
            if (vendingItems.getSlotLocation().equals(slotChoice)) {
                return vendingItems;
            }
        }
        return null;
    }

    public void makePurchase(String slotChoice) {
        BigDecimal itemPrice = getVendableBySlotChoice(slotChoice).getPrice();
        int inventoryAvailable = getVendableBySlotChoice(slotChoice).getInventoryAvailable();

        if ((userBalance.compareTo(itemPrice) == 0 || userBalance.compareTo(itemPrice) == 1) && inventoryAvailable > 0) {
            userBalance = userBalance.subtract(itemPrice);
            totalSales = totalSales.add(itemPrice);
            getVendableBySlotChoice(slotChoice).setInventoryAvailable(inventoryAvailable - 1);
            System.out.println("Your current remaining balance : $" + userBalance);
            System.out.println(getVendableBySlotChoice(slotChoice).displayMessage());
        } else if (userBalance.compareTo(itemPrice) == -1) {
            System.out.println("Sorry, please deposit more cash in order to complete that purchase.");
        } else if (inventoryAvailable == 0) {
            System.out.println("Sorry, this option is out of stock.");
        } logger.writeToLog(getVendableBySlotChoice(slotChoice).getName(), getVendableBySlotChoice(slotChoice).getPrice(), userBalance);

        int unitsSold =  salesReport.get(getVendableBySlotChoice(slotChoice).getName());
        salesReport.put(getVendableBySlotChoice(slotChoice).getName(), unitsSold + 1);
    }

    public void returnChange() {
        BigDecimal userChange = userBalance;
        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickel = new BigDecimal("0.05");
        BigDecimal zero = new BigDecimal("0.00");
        int numberOfQuarters = 0;
        int numberOfDimes = 0;
        int numberOfNickels = 0;

        while (userBalance.compareTo(zero) == 1) {
            if (userBalance.subtract(quarter).compareTo(zero) == 1 || userBalance.subtract(quarter).compareTo(zero) == 0) {
                numberOfQuarters++;
                userBalance = userBalance.subtract(quarter);
            }  else if (userBalance.subtract(dime).compareTo(zero) == 1 || userBalance.subtract(dime).compareTo(zero) == 0) {
                numberOfDimes++;
                userBalance = userBalance.subtract(dime);
            }else if (userBalance.subtract(nickel).compareTo(zero) == 1 || userBalance.subtract(nickel).compareTo(zero) == 0) {
                numberOfNickels++;
                userBalance = userBalance.subtract(nickel);
            } else if (userBalance.compareTo(nickel) ==  -1) {
                userBalance = userBalance.subtract(userBalance);
            }
        }
        logger.writeToLog("GIVE CHANGE:", userChange, userBalance);
        System.out.println("Here's your change of " + numberOfQuarters + " quarters, " + numberOfDimes + " dimes, and " + numberOfNickels + " nickels.");
    }

    public void generateSalesReport() {

        logger.createSalesReport(salesReport, totalSales);
    }
}





