package com.techelevator.dao;

import com.techelevator.model.Customer;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import java.util.List;

public interface CustomerDao {

    List<Customer> getAllCustomers();

    Customer searchCustomerByName(String nameSearch);

    Customer getCustomerById(int customerId);

    Customer getCustomerByPurchaseId(int customerId);

    void addCustomer(String name, String address, String phone, String email);

    void removeCustomer(int customerId);

    Customer mapRowToCustomer(SqlRowSet rowSet);
}
