package com.techelevator.dao;

import com.techelevator.model.Vehicle;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import javax.sql.DataSource;

public class JdbcVehicleDao implements VehicleDao {
    private final JdbcTemplate jdbcTemplate;

    public JdbcVehicleDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Vehicle getVehicle(int vehicleId) {
        Vehicle vehicle = null;
        String sql = "SELECT vehicle_id, vehicle_name, price " +
                "FROM vehicle WHERE vehicle_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, vehicleId);
        if (results.next()) {
            vehicle = mapRowToVehicle(results);
        }
        return vehicle;
    }

    public Vehicle mapRowToVehicle(SqlRowSet rowSet) {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(rowSet.getInt("vehicle_id"));
        vehicle.setName(rowSet.getString("vehicle_name"));
        vehicle.setPrice(rowSet.getInt("price"));
        return vehicle;
    }
}
