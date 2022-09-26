package com.techelevator;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;


    }
}


public int deposit(int amountToDeposit){

}
