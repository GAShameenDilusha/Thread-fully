package org.example;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class RunnableInterface1{
    public static void main(String[] args) {
        RunnableInterface demo=new RunnableInterface();
        Thread thread=new Thread(demo);
        thread.start();
    }
}
