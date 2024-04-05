package org.example;


//Threads Synchronized ..?
class Calculation{
    int num;

    public synchronized void increment(){
        num++;
        /*System.out.println("Count : "+num);*/
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Calculation calculation = new Calculation();
        Thread Th01= new Thread(() -> {
            for (int i=0; i<1000 ; i++){
                calculation.increment();
            }
        });
        Thread Th02= new Thread(() -> {
            for (int i=0; i<1000 ; i++){
                calculation.increment();
            }
        });
        Th01.start();
        Th02.start();
       /* Wait until new threads to join the main thread (join) */
        Th01.join();
        Th02.join();


        System.out.println("Count : "+calculation.num);
    }
}