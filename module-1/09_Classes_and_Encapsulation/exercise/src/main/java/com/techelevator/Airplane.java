package com.techelevator;


public class Airplane {
    String planeNumber;
    int totalFirstClassSeats = 2;
    int bookedFirstClassSeats = 0;
    int availableFirstClassSeats = 2;
    int totalCoachSeats;

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return availableCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return availableFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    int bookedCoachSeats;
    int availableCoachSeats = 3;

    public Airplane(String planeNumber, int totalCoachSeats, int totalFirstClassSeats) {
        this.planeNumber = planeNumber;
        this.totalCoachSeats = 3;
        this.totalFirstClassSeats = 2;
    }

    public int availableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int availableCoachSeats() {
      return totalCoachSeats - bookedCoachSeats;
    }
    public boolean reserveSeats(boolean firstClass, int totalNumberOfSeats) {
        if (firstClass) {
            if (totalNumberOfSeats > availableFirstClassSeats()) {
                return false;
            }
            bookedFirstClassSeats += totalNumberOfSeats;
        } else {
            if (totalNumberOfSeats > availableCoachSeats()) {
                return false;
            }
            bookedCoachSeats += totalNumberOfSeats;
        }
        return true;
    }


}


