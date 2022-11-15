package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techelevator.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcCustomerDao implements CustomerDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcCustomerDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        String sql = "SELECT customer_id, customer_name, address, " +
                     "phone, emailaddress FROM customer;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Customer customerResult = mapRowToCustomer(results);
            customers.add(customerResult);
        }
        return customers;
    }

    @Override
    public Customer searchCustomerByName(String nameSearch) {
        Customer customer = null;
        String sql = "SELECT customer_id, customer_name, address, " +
                "phone, emailaddress FROM customer WHERE customer_name ILIKE ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, nameSearch);
        if (results.next()) {
            customer = mapRowToCustomer(results);
        }
        return customer;
    }
    @Override
    public Customer getCustomerById(int customerId) {
        Customer customer = null;
        String sql = "SELECT customer_id, customer_name, address, " +
                "phone, emailaddress FROM customer WHERE customer_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, customerId);
        if (results.next()) {
            customer = mapRowToCustomer(results);
        }
        return customer;
    }

    @Override
    public Customer getCustomerByPurchaseId(int purchaseId) {
        Customer customer = new Customer();
        String sqlGetCustomerByPurchaseId = "SELECT c.customer_id, c.customer_name, " +
                "c.address, c.phone, c.emailaddress FROM customer c "+
                "JOIN purchase p ON c.customer_id = p.customer_id "+
                "WHERE p.purchase_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetCustomerByPurchaseId, purchaseId);
        if (results.next()) {
            customer = mapRowToCustomer(results);
        }
        return customer;
    }

    @Override
    public void addCustomer(String name, String address, String phone, String email) {
        String sqlAddCustomer = "INSERT INTO customer (customer_name, " +
                "address, phone, emailaddress) VALUES (?, ?, ?, ?);";
        jdbcTemplate.update(sqlAddCustomer, name, address, phone, email);
    }

    @Override
    public void removeCustomer(int customerId) {
        String sqlRemovePurchase = "DELETE FROM purchase WHERE customer_id = ?;";
        jdbcTemplate.update(sqlRemovePurchase, customerId);
        String sqlRemoveCustomer = "DELETE FROM customer WHERE customer_id = ?;";
        jdbcTemplate.update(sqlRemoveCustomer, customerId);

    }

    public Customer mapRowToCustomer(SqlRowSet rowSet) {
        Customer customer = new Customer();
        int x = rowSet.getInt("customer_id");
        customer.setId(rowSet.getInt("customer_id"));
        customer.setName(rowSet.getString("customer_name"));
        customer.setAddress(rowSet.getString("address"));
        customer.setPhone(rowSet.getString("phone"));
        customer.setEmail(rowSet.getString("emailaddress"));
        return customer;
    }

}
