package org.example;

public class Main {
    public static void main(String[] args) {

        /*Step 01*/
        /*Runnable obj1 = new Runnable(){
            public void run(){
                for (int i=0; i<5 ; i++){
                    System.out.println("one");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable obj2 = new Runnable(){
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Two");
                    try {
                        Thread.sleep(310);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };*/

        /*Step 02*/
       /* Runnable obj1 = () -> {
            for (int i=0; i<5 ; i++){
                System.out.println("one");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Two");
                try {
                    Thread.sleep(310);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(obj1);
        Thread thread1 = new Thread(obj2);*/

        /*Step 03*/
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

        thread.start();
        thread1.start();
    }
}

/*If there is a functional interface tha mean we can use Lambda with it*/
