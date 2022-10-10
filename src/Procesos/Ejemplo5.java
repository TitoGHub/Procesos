package Procesos;

import java.io.IOException;

public class Ejemplo5 {
    public static void main(String[] args){
        ProcessBuilder pb = new ProcessBuilder("date");
        try {
            Process p1 = pb.start();
            Utilidades.enviarDatos(p1, "22/09/2022");
            Utilidades.mostrarSalidaProcesoConBuffer(p1);
            Utilidades.mostrarErroresProcesoConBuffer(p1);
        } catch (IOException e) {
            System.out.println("No se pudo crear un proceso");

        }
    }
    }

