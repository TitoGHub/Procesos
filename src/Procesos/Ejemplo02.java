package Procesos;

import java.io.*;

public class Ejemplo02 {
    public static void main(String[] args){

        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "DIR");
        try {
            Process p1 = pb.start();
            mostrarResultado(p1);
            mostrarError(p1);
        } catch (IOException e) {
            System.out.println("No se pudo crear un proceso");

        }
    }

    private static void mostrarError(Process p1) {
        try {
            InputStream is = p1.getErrorStream();
            int l = 0;
            while ((l = is.read()) != -1) {
                System.out.print((char) l);
            }
        } catch (IOException e) {
            System.out.println("Error al leer la salida de procesos");
        }
    }

    private static void mostrarResultado(Process p1) {
        try {
            InputStream is = p1.getInputStream();
            int l = 0;
            while ((l = is.read()) != -1) {
                System.out.print((char) l);
            }
        } catch (IOException e) {
            System.out.println("Error al leer la salida de procesos");
        }
    }

    public static void mostrarSalidaProcesoConBuffer(Process p){
        try {
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
            is.close();
        }catch (IOException e){
            System.out.println("Error al leer la salida de procesos");
        }
        
       
    }

    public static void mostrarSalidaErroresConBuffer(Process p){

    }
}
