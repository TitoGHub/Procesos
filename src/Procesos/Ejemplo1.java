package Procesos;

import java.io.IOException;
import java.util.TooManyListenersException;

public class Ejemplo1 {
    public static void main (String[] args) {
        ProcessBuilder pb = new ProcessBuilder("notepad");
        ProcessBuilder pbc = new ProcessBuilder("calc");
        try {
            try {
                Process p = pb.start();
                p.waitFor();
                Process pc = pbc.start();
            } catch (IOException e) {
                System.out.println("mensaje");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } finally {

        }
    }
}
