package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i=1;i<=5;i++){
                System.out.println("One" + Thread.currentThread());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=1;i<=5;i++){
                System.out.println("Two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();       //start(); method eken thama run(); method eka execute wenne...
        //t1.setName("Thread One");            //setName(); method eka use kare code ekak rebud karanna one unoth pahasuwen adura ganeemataya..
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Name: " + t1.getName());
        t2.start();

        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println("Thread priority :" + t1.getPriority());


        t1.join();     //join(); method eken wenne t1 and t2 iwara unata passe anthimata sout eka print wenna...
        t2.join();

        System.out.println("Thread One Status" + t2.isAlive());
        System.out.println("BYE");



    }
}