package com.multithreading.mainTask;


public class Car extends Thread {
    private boolean staying=false;
    private ParkingPlacesPool pool;
    public Car(ParkingPlacesPool pool){
        this.pool=pool;
    }
    public void run(){
        ParkingPlace place=null;
        try{
            place=pool.getPlaces(400);
            staying=true;

            System.out.println("Car client #"+this.getId()+" TOOK parking place #"+place.getParkingPlaceId()+" for "+place.getTimeOccupiedPlace()+" minutes");
            place.using();
        }catch (ParkingException e){
            System.out.println("Car #"+this.getId()+" lost->"+e.getMessage());
        } finally {
            if(place!=null){
                staying=false;
                System.out.println("Car #"+this.getId()+" : #"+place.getParkingPlaceId()+" parking place RELEASED");
                pool.returnParkingPlace(place);
            }
        }
    }
    public boolean isStaying(){
        return staying;
    }
}
