package Hilos;

public class EjemploReloj {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Relojes");
        HiloReloj hr1 = new HiloReloj(tg, "relojMadrid", 5, "Europe/Madrid");
        hr1.getHilo().start();
    }
}
