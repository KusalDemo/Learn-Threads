package org.example;


class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running..");
    }
}
public class Main {
    public static void main(String[] args) {
        /*Create an instance of MyThread class*/
        MyThread myThread = new MyThread();

        /*Create a Thread object , passing the instance of MyThread to its constructor*/
        Thread thread = new Thread(myThread);

        /*Strat the thread*/
        thread.start();
    }
}