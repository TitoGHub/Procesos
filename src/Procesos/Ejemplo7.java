package Procesos;

import java.io.File;
import java.io.IOException;

public class Ejemplo7 {
    public static void main(String[]args){
        String salida = "salida.txt";
        String errores = "errores.txt";
        String entrada = "scriptEntrada.txt";


        File fs = new File(salida);
        File fe = new File(errores);
        File fi = new File(entrada);

        ProcessBuilder pb = new ProcessBuilder("cmd");


        pb.redirectOutput(fs);
        pb.redirectError(fe);
        pb.redirectInput(fi);

        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
