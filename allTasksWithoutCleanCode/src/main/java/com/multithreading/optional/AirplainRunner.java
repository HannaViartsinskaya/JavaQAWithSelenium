package com.multithreading.optional;

import java.util.concurrent.Semaphore;

public class AirplainRunner
{
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(5);
        new AirplainOT(semaphore,"LT6589").start();
        new AirplainOT(semaphore,"PL6578").start();
        new AirplainOT(semaphore,"PL1234").start();
        new AirplainOT(semaphore,"LT6129").start();
        new AirplainOT(semaphore,"PL4578").start();
        new AirplainOT(semaphore,"PL7234").start();
        new AirplainOT(semaphore,"GE6589").start();
        new AirplainOT(semaphore,"NO6578").start();
        new AirplainOT(semaphore,"US1234").start();
        new AirplainOT(semaphore,"CA1234").start();
    }

}
