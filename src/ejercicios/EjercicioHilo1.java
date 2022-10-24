package ejercicios;

public class EjercicioHilo1 extends Thread{



    public EjercicioHilo1(String tictac, int prioridad) {
        super(tictac);
        this.setPriority(prioridad);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
            System.out.print(this.getName());
            Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
