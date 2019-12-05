package com.multithreading.optional;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class AirplainOT extends Thread{
    Semaphore sem;
    private boolean full = false;
    String boardNumber;
    public AirplainOT(Semaphore sem,String boardNumber){
        this.sem=sem;
        this.boardNumber=boardNumber;
    }

    @Override
    public void run() {
        try{
            if(!full){
                sem.acquire();
                System.out.println(boardNumber+" начал выход на полосу");
                TimeUnit.MILLISECONDS.sleep(1500);
                full=true;
                System.out.println(boardNumber+" взлетел");
                System.out.println(boardNumber+" Полоса \"приняла\" самолет");

                TimeUnit.MILLISECONDS.sleep(1500);
                System.out.println(boardNumber+" Полоса освободилась");
                sem.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
