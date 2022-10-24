//package Hilos;
//
//
//public class Ejemplo2TICTACRunnable {
//        public static void main (String[]args){
//            HiloRunnable1 h1 = new HiloRunnable1("TIC ");
//            HiloRunnable1 h2 = new HiloRunnable1("TAC ");
//
//
//            h1.getHilo1().start();
//            h2.getHilo1().start();
//
//            try {
//                h1.join();
//                h2.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//            System.out.println(" ");
//            System.out.println("FIN");
//        }
//    }
