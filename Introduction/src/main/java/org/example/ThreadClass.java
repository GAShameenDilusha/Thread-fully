package org.example;

public class ThreadClass  extends Thread{

    public void run(){
        System.out.println("Thread is running");
    }
}

class Example2 {
    public static void main(String[] args) {
        ThreadClass example=new ThreadClass();
        example.start();
    }
}
