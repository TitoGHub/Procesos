package Procesos;

import java.io.File;
import java.io.IOException;

public class Ejemplo8 {
    public static void main(String[]args){
        String salida = "salida.txt";

        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "dir");


        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
