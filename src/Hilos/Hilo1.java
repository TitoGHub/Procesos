package Hilos;

import java.util.PriorityQueue;

public class Hilo1 extends Thread{

    public Hilo1(String hilo,int prioridad, ThreadGroup tg) {
        super(tg,hilo);
        this.setPriority(prioridad);

    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("Estoy en el hilo: " + this.getName());
            System.out.println("están ejecutandose: " + Thread.currentThread().activeCount() + " hilos");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println("|||||||||||fin del hilo " + this.getName());
    }
}
