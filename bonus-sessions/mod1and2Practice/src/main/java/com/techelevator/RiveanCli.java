package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import com.techelevator.dao.*;
import com.techelevator.model.*;
import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import com.techelevator.model.Purchase;

public class RiveanCli {
    private final Scanner scan = new Scanner(System.in);
    private final CustomerDao customerDao;
    private final PurchaseDao purchaseDao;

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/RiveanEDV");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        RiveanCli application = new RiveanCli(dataSource);
        application.run();
    }

    public RiveanCli (DataSource dataSource) {
        customerDao = new JdbcCustomerDao(dataSource);
        purchaseDao = new JdbcPurchaseDao(dataSource);
    }

    private void run() {
        Customer customer;
        Purchase purchase;
        List<Purchase> purchases;
        String name;
        String purchaseIdStr;
        String customerIdStr;
        int purchaseId;


        boolean running = true;
        while (running) {
            System.out.println("**************************************************************************************");
            System.out.print("Enter:\n" +
                    "1 - get all customers\n" +
                    "2 - get customer\n" +
                    "3 - get customer by purchase ID\n" +
                    "4 - add a new customer\n" +
                    "5 - remove a customer\n" +
                    "6 - get all purchases\n" +
                    "7 - get purchase by purchase ID\n" +
                    "8 - get purchase(s) by customer name\n" +
                    "9 - add a new purchase\n" +
                    "10 - remove a purchase\n" +
                    "11 - exit\nEnter your selection here: ");
            String numberStr = scan.nextLine();
            int number = Integer.parseInt(numberStr);
            System.out.println("**************************************************************************************");
            switch (number) {
                case 1:
                    List<Customer> customers = customerDao.getAllCustomers();
                    for (Customer item : customers) {
                        System.out.println(item);
                    }
                    break;
                case 2:
                    System.out.print("Enter customer name: ");
                    name = scan.nextLine();
                    customer = customerDao.searchCustomerByName(name);
                    System.out.println(customer);
                    break;
                case 3:
                    System.out.print("Enter purchase ID: ");
                    purchaseIdStr = scan.nextLine();
                    purchaseId = Integer.parseInt(purchaseIdStr);
                    customer = customerDao.getCustomerByPurchaseId(purchaseId);
                    System.out.println(customer);
                    break;
                case 4:
                    System.out.print("Enter customer name: ");
                    name = scan.nextLine();
                    System.out.print("Enter address: ");
                    String address = scan.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scan.nextLine();
                    System.out.print("Enter email address: ");
                    String email = scan.nextLine();
                    customerDao.addCustomer(name, address, phone, email);
                    break;
                case 5:
                    System.out.print("Enter customer ID: ");
                    customerIdStr = scan.nextLine();
                    int customerId = Integer.parseInt(customerIdStr);
                    customerDao.removeCustomer(customerId);
                    break;
                case 6:
                    purchases = purchaseDao.getAllPurchases();
                    for (Purchase item : purchases) {
                        System.out.println(item);
                    }
                    break;
                case 7:
                    System.out.print("Enter purchase ID: ");
                    purchaseIdStr = scan.nextLine();
                    purchaseId = Integer.parseInt(purchaseIdStr);
                    purchase = purchaseDao.getPurchaseById(purchaseId);
                    System.out.println(purchase);
                    break;
                case 8:
                    System.out.print("Enter customer name: ");
                    String customerName = scan.nextLine();
                    purchases = purchaseDao.getPurchasesByCustomerName(customerName);
                    for (Purchase item : purchases) {
                        System.out.println(item);
                    }
                    break;
                case 9:
                    purchase = new Purchase();
                    System.out.print("Enter customer ID: ");
                    customerIdStr = scan.nextLine();
                    purchase.setCustomerId(Integer.parseInt(customerIdStr));
                    System.out.print("Enter vehicle ID ('1' for EDV500, '2' for EDV700, or '3' for EDV900): ");
                    String vehicleIdStr = scan.nextLine();
                    purchase.setVehicleId(Integer.parseInt(vehicleIdStr));
                    System.out.print("Enter date 'yyyy-mm-dd': ");
                    purchase.setPurchaseDate(LocalDate.parse(scan.nextLine()));
                    System.out.print("Enter number of vehicles: ");
                    String numOfVehStr = scan.nextLine();
                    purchase.setNumOfVehicle(Integer.parseInt(numOfVehStr));
                    purchaseDao.addPurchase(purchase);
                    break;
                case 10:
                    System.out.print("Enter purchase ID: ");
                    purchaseIdStr = scan.nextLine();
                    purchaseId = Integer.parseInt(purchaseIdStr);
                    purchaseDao.removePurchase(purchaseId);
                    break;
                default:
                    running = false;
            }
        }
    }
}








    /*
            if (number == 1) {
                List<Customer> customers = customerDao.getAllCustomers();
                for(Customer item: customers) {
                    System.out.println(item);
                }
            } else if (number==2) {
                System.out.print("Enter customer name: ");
                String name = scan.nextLine();
                Customer customer = customerDao.searchCustomerByName(name);
                System.out.println(customer);
            } else if (number==3) {
                System.out.print("Enter purchase ID: ");
                String purchaseIdStr = scan.nextLine();
                int purchaseId = Integer.parseInt(purchaseIdStr);
                Customer customer = customerDao.getCustomerByPurchaseId(purchaseId);
                System.out.println(customer);
            } else if (number==4) {
                System.out.print("Enter customer name: ");
                String name = scan.nextLine();
                System.out.print("Enter address: ");
                String address = scan.nextLine();
                System.out.print("Enter phone number: ");
                String phone = scan.nextLine();
                System.out.print("Enter email address: ");
                String email = scan.nextLine();
                customerDao.addCustomer(name, address, phone, email);
            } else if (number==5) {
                System.out.print("Enter customer ID: ");
                String customerIdStr = scan.nextLine();
                int customerId = Integer.parseInt(customerIdStr);
                customerDao.removeCustomer(customerId);
            } else if (number == 6) {
                List<Purchase> purchases = purchaseDao.getAllPurchasesV2();
                for (Purchase item : purchases) {
                    System.out.println(item);
                }
            } else if (number==7) {
            System.out.print("Enter purchase ID: ");
            String purchaseIdStr = scan.nextLine();
            int purchaseId = Integer.parseInt(purchaseIdStr);
            Purchase purchase = purchaseDao.getPurchaseById(purchaseId);
            System.out.println(purchase);
        } else if (number==8) {
            System.out.print("Enter customer name: ");
            String customerName = scan.nextLine();
            List<Purchase> purchases = purchaseDao.getPurchasesByCustomerName(customerName);
            for (Purchase item : purchases) {
                System.out.println(item);
            }
        } else if (number==9) {
                Purchase purchase = new Purchase();
                System.out.print("Enter customer ID: ");
                String customerIdStr = scan.nextLine();
                purchase.setCustomerId(Integer.parseInt(customerIdStr));
                System.out.print("Enter vehicle ID ('1' for EDV500, '2' for EDV700, or '3' for EDV900): ");
                String vehicleIdStr = scan.nextLine();
                purchase.setVehicleId(Integer.parseInt(vehicleIdStr));
                System.out.print("Enter date 'yyyy-mm-dd': ");
                purchase.setPurchaseDate(LocalDate.parse(scan.nextLine()));
                System.out.print("Enter number of vehicles: ");
                String numOfVehStr = scan.nextLine();
                purchase.setNumOfVehicle(Integer.parseInt(numOfVehStr));
                purchaseDao.addPurchase(purchase);
            } else if (number==10) {
                System.out.print("Enter purchase ID: ");
                String purchaseIdStr = scan.nextLine();
                int purchaseId = Integer.parseInt(purchaseIdStr);
                purchaseDao.removePurchase(purchaseId);
            } else {
                running = false;
            }
            */
