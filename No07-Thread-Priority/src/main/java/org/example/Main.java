package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread( () -> {
            for (int i=0; i<5 ; i++){
                System.out.println("one :"+Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"ThreadOneBng");
        Thread thread1 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Two :"+Thread.currentThread().getName());
                try {
                    Thread.sleep(310);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"ThreadTwoBng");

        thread.start();
        thread.setPriority(Thread.MIN_PRIORITY);
        /*thread.setName("Thread one");*/
        System.out.println("Thread one's status (is alive ?) : "+thread.isAlive());
        System.out.println("Thread one's name that assigned :" + thread.getName());

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        /*thread1.setName("Thread Two");*/


        thread.join();
        thread1.join();
        System.out.println("Thread one's status (is alive ?) : "+thread.isAlive());
        System.out.println("Thread two's name : "+thread1.getName());
        System.out.println("Thread priority : "+ thread1.getPriority());

        System.out.println("BYE..");
    }
}

/*
Terminal code for find thread count : ps -eo nlwp | tail -n +2 | awk '{ num_threads += $1 } END { print num_threads }'*/
