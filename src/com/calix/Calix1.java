package com.calix;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Calix1 {


    public static void main(String[] args) {

        Object lock = new Object();
        MyThread myThread = new MyThread(100);
        Thread t1 = new Thread(myThread);
        t1.start();

        Thread t2 = new Thread(myThread);
        t2.start();
        Thread t3 = new Thread(myThread);
        t3.start();
        Thread t4 = new Thread(myThread);
        t4.start();
        Thread t5 = new Thread(myThread);
        t5.start();

    }

}



class MyThread implements  Runnable{

    Object obj ;
    private static AtomicInteger counter = new AtomicInteger(0);

    private int maxLimit;

    MyThread(int maxLimit){
        this.maxLimit = maxLimit;
    }



    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                if (counter.get() < maxLimit) {
                    System.out.println(Thread.currentThread().getName() + "-" + counter.getAndIncrement());
                    notifyAll();
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    notifyAll();
                    break;
                }
            }
        }
        }
}