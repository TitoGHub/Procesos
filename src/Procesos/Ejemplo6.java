package Procesos;

import java.io.File;
import java.io.IOException;

public class Ejemplo6 {
    public static void main(String[] args){
        String salida = "salida.txt";
        String errores = "errores.txt";

        File fs = new File(salida);
        File fe = new File(errores);

        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir1");


        pb.redirectOutput(fs);
        pb.redirectError(fe);

        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
