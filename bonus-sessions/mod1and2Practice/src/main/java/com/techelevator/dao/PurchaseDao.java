package com.techelevator.dao;

import com.techelevator.model.Purchase;

import java.util.List;

public interface PurchaseDao {

    List<Purchase> getAllPurchases();

    List<Purchase> getAllPurchasesV2();

    List<Purchase> getPurchasesByCustomerName(String customerName);

    Purchase getPurchaseById(int purchaseId);

    void addPurchase(Purchase newPurchase);

    void removePurchase(int purchaseId);

}
