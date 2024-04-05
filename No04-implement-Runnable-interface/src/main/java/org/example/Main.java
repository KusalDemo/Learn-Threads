package org.example;


/*We are gonna run this classes parallel*/
class One implements Runnable{
    public void run(){
        for (int i=0; i<5 ; i++){
            System.out.println("one");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Two implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Two");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();

        Thread thread = new Thread(one);
        Thread thread1 = new Thread(two);

        thread.start();
        thread1.start();
    }
}