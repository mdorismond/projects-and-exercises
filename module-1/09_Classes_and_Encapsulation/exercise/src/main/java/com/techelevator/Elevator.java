package com.techelevator;

public class Elevator {
    public int currentFloor = 1;
    public int numberOfFloors = 5;
    public boolean doorOpen;

    public Elevator(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Elevator(int currentFloor, int numberOfFloors, boolean doorOpen) {
        this.currentFloor = currentFloor;
        this.numberOfFloors = numberOfFloors;
        this.doorOpen = doorOpen;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }




    public void openDoor(){
    doorOpen = true;
    }



 public void closeDoor(){
    doorOpen = false;
 }


 public void goUp(int desiredFloor) {
     if (doorOpen && currentFloor < numberOfFloors) {
         currentFloor++;
     }
 }

     public void goDown ( int desiredFloor){
         if (doorOpen && currentFloor > numberOfFloors) {
             currentFloor--;
         }


     }
 }
