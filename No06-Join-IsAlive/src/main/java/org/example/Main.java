package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread( () -> {
            for (int i=0; i<5 ; i++){
                System.out.println("one");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread1 = new Thread( () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Two");
                try {
                    Thread.sleep(310);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        /*thread.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();

        System.out.println("BYE..");

        */
        /*Output >
                one
                BYE..
                Two
                one
                Two
                one
                Two
                one
                Two
                one
                Two*/


        //Join() / isAlive()
        thread.start();
        System.out.println("Thread one's status (is alive ?) : "+thread.isAlive());

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();


        thread.join();
        thread1.join();
        System.out.println("Thread one's status (is alive ?) : "+thread.isAlive());

        System.out.println("BYE..");
    }
}