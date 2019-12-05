package com.multithreading.mainTask;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) {
        LinkedList<ParkingPlace> list=new LinkedList<ParkingPlace>();
        list.add(new ParkingPlace(771));
        list.add(new ParkingPlace(881));
        list.add(new ParkingPlace(971));
        list.add(new ParkingPlace(654));
        list.add(new ParkingPlace(786));
        list.add(new ParkingPlace(123));
        ParkingPlacesPool pool=new ParkingPlacesPool(list);
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            new Car(pool).start();

        }
    }
}
