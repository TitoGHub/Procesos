package Hilos;

public class Ejemplo1 {
    public static void main(String[] args) {

        System.out.println("El hilo actual es " + Thread.currentThread().toString());
        ThreadGroup tg = new ThreadGroup("Grupo 1");
        Hilo1 h1 = new Hilo1("hilo1", 5, tg);
        Hilo1 h2 = new Hilo1("hilo2", 1, tg);
        Hilo1 h3 = new Hilo1("hilo3", 10, tg);
        Hilo1 h4 = new Hilo1("hilo4", 1, tg);
        Hilo1 h5 = new Hilo1("hilo5", 5, tg);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        try {
            h1.join(); // espera a que acabe el hilo
            h2.join();
            h3.join();
            h4.join();
            h5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("fin");
    }
}
