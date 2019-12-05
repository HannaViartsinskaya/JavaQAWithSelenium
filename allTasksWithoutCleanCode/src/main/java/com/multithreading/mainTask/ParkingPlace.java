package com.multithreading.mainTask;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ParkingPlace {
    private int parkingPlaceId;
    private int timeOccupiedPlace;
    public ParkingPlace(int parkingPlaceId){
        super();
        this.timeOccupiedPlace=new Random().nextInt(400);
        this.parkingPlaceId=parkingPlaceId;
    }

    public int getParkingPlaceId() {
        return parkingPlaceId;
    }

    public void setParkingPlaceId(int parkingPlaceId) {
        this.parkingPlaceId = parkingPlaceId;
    }

    public int getTimeOccupiedPlace() {
        return timeOccupiedPlace;
    }

    public void setTimeOccupiedPlace(int timeOccupiedPlace) {
        this.timeOccupiedPlace = timeOccupiedPlace;
    }

    public void using(){
        try{

            TimeUnit.MILLISECONDS.sleep(this.timeOccupiedPlace);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
