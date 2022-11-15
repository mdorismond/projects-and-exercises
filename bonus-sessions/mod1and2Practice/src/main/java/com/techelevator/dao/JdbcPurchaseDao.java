package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.techelevator.model.Customer;
import com.techelevator.model.Purchase;
import com.techelevator.model.Vehicle;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcPurchaseDao implements PurchaseDao {
    private final JdbcTemplate jdbcTemplate;
    private final VehicleDao vehicleDao;
    private final CustomerDao customerDao;

    public JdbcPurchaseDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.vehicleDao = new JdbcVehicleDao(dataSource);
        this.customerDao = new JdbcCustomerDao(dataSource);
    }

    @Override
    public List<Purchase> getAllPurchases() {
        List<Purchase> purchases = new ArrayList<>();
        String sql = "SELECT purchase_id, customer_id, vehicle_id, purchase_date, " +
                "vehicle_count FROM purchase;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Purchase purchaseResult = mapRowToPurchase(results);
            purchases.add(purchaseResult);
        }
        return purchases;
    }

    @Override
    public List<Purchase> getAllPurchasesV2() {
        List<Purchase> purchases = new ArrayList<>();
        String sql = "SELECT c.customer_id, c.customer_name, c.address, c.phone, c.emailaddress, " +
                "p.purchase_date, p.vehicle_id, v.vehicle_name, v.price, p.vehicle_count, " +
                "p.purchase_id FROM customer c " +
                "JOIN purchase p ON c.customer_id = p.customer_id " +
                "JOIN vehicle v ON p.vehicle_id = v.vehicle_id;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            Purchase purchaseResult = mapRowToPurchaseV2(results);
            purchases.add(purchaseResult);
        }
        return purchases;
    }

    @Override
    public List<Purchase> getPurchasesByCustomerName(String customerName) {
        List<Purchase> purchases = new ArrayList<>();
        String sql = "SELECT purchase_id, p.customer_id, vehicle_id, " +
                "purchase_date, vehicle_count FROM purchase p " +
                "JOIN customer c ON p.customer_id = c.customer_id " +
                "WHERE c.customer_name = ?;";
        SqlRowSet purchaseResults = jdbcTemplate.queryForRowSet(sql, customerName);
        while (purchaseResults.next()) {
            purchases.add(mapRowToPurchase(purchaseResults));
        }
        return purchases;
    }

    @Override
    public Purchase getPurchaseById(int purchaseId) {
        Purchase purchase = null;
        String sqlGetPurchaseById = "SELECT purchase_id, customer_id, vehicle_id, " +
                "purchase_date, vehicle_count FROM purchase WHERE purchase_id =?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetPurchaseById, purchaseId);
        if (results.next()) {
            purchase = mapRowToPurchase(results);
        }
        return purchase;
    }

    @Override
    public void addPurchase(Purchase newPurchase) {
        String sqlAddPurchase = "INSERT INTO purchase (customer_id, " +
                "vehicle_id, purchase_date, vehicle_count) VALUES " +
                "(?, ?, ?, ?);";
        jdbcTemplate.update(sqlAddPurchase, newPurchase.getCustomerId(),
                newPurchase.getVehicleId(), newPurchase.getPurchaseDate(),
                newPurchase.getNumOfVehicle());
    }

    @Override
    public void removePurchase(int purchaseId) {
        String sql = "DELETE FROM purchase WHERE purchase_id = ?;";
        jdbcTemplate.update(sql, purchaseId);
    }

    private Purchase mapRowToPurchase(SqlRowSet rowSet) {
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(rowSet.getInt("purchase_id"));
        purchase.setCustomerId(rowSet.getInt("customer_id"));
        purchase.setVehicleId(rowSet.getInt("vehicle_id"));
        purchase.setPurchaseDate(rowSet.getDate("purchase_date").toLocalDate());
        purchase.setNumOfVehicle(rowSet.getInt("vehicle_count"));
        Customer customerResults = customerDao.getCustomerById(purchase.getCustomerId());
        purchase.setCustomer(customerResults);
        Vehicle vehicleResults = vehicleDao.getVehicle(purchase.getVehicleId());
        purchase.setVehicle(vehicleResults);
        return purchase;
    }

    private Purchase mapRowToPurchaseV2(SqlRowSet rowSet) {
        Purchase purchase = new Purchase();

        purchase.setPurchaseId(rowSet.getInt("purchase_id"));
        purchase.setCustomerId(rowSet.getInt("customer_id"));
        purchase.setVehicleId(rowSet.getInt("vehicle_id"));
        purchase.setPurchaseDate(rowSet.getDate("purchase_date").toLocalDate());
        purchase.setNumOfVehicle(rowSet.getInt("vehicle_count"));

        /* replace this block of code to set the vehicle data
           with a call to the vehicle DAO map method
        Vehicle vehicle = new Vehicle();
        vehicle.setId(vehicleId);
        vehicle.setPrice(rowSet.getInt("price"));
        vehicle.setName(rowSet.getString("vehicle_name"));
        purchase.setVehicle(vehicle);
        */
        purchase.setVehicle(vehicleDao.mapRowToVehicle(rowSet));

        /* replace this block of code to set the customer data
           with a call to the customer DAO map method
        Customer customer = new Customer();
        customer.setId(customerId);
        customer.setName(rowSet.getString("customer_name"));
        customer.setAddress(rowSet.getString("address"));
        customer.setPhone(rowSet.getString("phone"));
        customer.setPhone(rowSet.getString("emailaddress"));
        purchase.setCustomer(customer);
         */
        purchase.setCustomer(customerDao.mapRowToCustomer(rowSet));
        return purchase;
    }

}