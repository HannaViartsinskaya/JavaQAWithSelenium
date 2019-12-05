package com.multithreading.mainTask;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ParkingPlacesPool {
    private final static int POOL_SIZE=5;
    private final Semaphore semaphore=new Semaphore(POOL_SIZE,true);
    private final Queue<ParkingPlace> parkingPlaces=new LinkedList<ParkingPlace>();
    public ParkingPlacesPool(Queue<ParkingPlace> places){
        parkingPlaces.addAll(places);
    }
    public ParkingPlace getPlaces(long maxWaitMillis) throws ParkingException {
        try{
            if(semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)){
                ParkingPlace res=parkingPlaces.poll();
                return res;
            }
        } catch (InterruptedException e) {
            throw new ParkingException(e);
        }
        throw new ParkingException(" waiting time is too long");
    }
    public void returnParkingPlace(ParkingPlace place){
        parkingPlaces.add(place);
        semaphore.release();
    }
}
