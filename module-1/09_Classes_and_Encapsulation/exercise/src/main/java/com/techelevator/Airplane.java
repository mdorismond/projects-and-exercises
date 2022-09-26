package com.techelevator;

public class Airplane {

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats() {
        (Similar logic)
    }
    public boolean reserveSeats(boolean firstClass, int totalNumberOfSeats) {
        if (firstClass) {
            if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
                return false;
            }
            bookedFirstClassSeats += totalNumberOfSeats;
        } else {
            if (totalNumberOfSeats > getAvailableCoachSeats()) {
                return false;
            }
            bookedCoachSeats += totalNumberOfSeats;
        }
        return true;
    }


}
