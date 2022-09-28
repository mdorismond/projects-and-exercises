package com.techelevator;

import java.util.ArrayList;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccounts(ArrayList<Accountable> accounts) {
        this.accounts = accounts;
    }
    public Accountable[] getAccounts() {
        Accountable[] account = new Accountable[this.accounts.size()];
        for (int i = 0; i < this.accounts.size(); i++) {
            account[i] = this.accounts.get(i);
        }
        return account;
    }



   public void addAccount(Accountable newAccount) {
       accounts.add(newAccount);
   }






       boolean isVip() {
        boolean vipStatus = isVip() ;
            int balance = 0;
            for (Accountable newAccount: accounts) {

                balance = balance + newAccount.getBalance();
            }
            if (balance >= 25000) {
                vipStatus = true;
            }
           return vipStatus;
       }

}


