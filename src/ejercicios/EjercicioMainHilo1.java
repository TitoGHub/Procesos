package ejercicios;


public class EjercicioMainHilo1 {
    public static void main(String[] args) {
        EjercicioHilo1 h1 = new EjercicioHilo1("TIC ", 5);
        EjercicioHilo1 h2 = new EjercicioHilo1("TAC ", 1);



        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" ");
        System.out.println("FIN");
    }
}
