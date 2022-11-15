package com.techelevator.dao;

import com.techelevator.model.Vehicle;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface VehicleDao {
    Vehicle getVehicle(int vehicleId);

    Vehicle mapRowToVehicle(SqlRowSet rowSet);
}
