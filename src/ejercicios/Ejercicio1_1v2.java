package ejercicios;

import Procesos.Utilidades;

import java.io.*;

public class Ejercicio1_1v2 {
    public static void main(String[] args) {
        int x1= 4;
        int y1 = 5;
        int x2 = 2;
        int y2 = 6;
        String textox1 = String.valueOf(x1);
        String textoy1 = String.valueOf(y1);
        String textox2= String.valueOf(x2);
        String textoy2 = String.valueOf(y2);
        //Voy a crear el proceso 1

        try {
            ProcessBuilder pb1 = new ProcessBuilder("java", "Procesos/Ejercicio1_1", textox1,textoy1);
            File f1 = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
            pb1.directory(f1);
            Process p1 = pb1.start();
            String valor1 = recogerValorSalida(p1);
            Utilidades.mostrarErroresProcesoConBuffer(p1);


            ProcessBuilder pb2 = new ProcessBuilder("java", "Procesos/Ejercicio1_1", textox2,textoy2);
            File f2 = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
            pb2.directory(f2);
            Process p2 = pb2.start();
            String valor2= recogerValorSalida(p2);
            Utilidades.mostrarErroresProcesoConBuffer(p2);




            try {
                p1.waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                p2.waitFor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ProcessBuilder pb3 = new ProcessBuilder("java","Procesos/Ejercicio1_1",valor1,valor2);
            File f3 = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
            pb3.directory(f3);
            Process p3 = pb3.start();
            String valorfinal = recogerValorSalida(p3);
            System.out.println("el numero mayor de todos es " + valorfinal);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String recogerValorSalida(Process p)
    {
        try {
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            String resultado = "";
            while((linea = br.readLine()) != null)
            {
                System.out.println(linea);
                resultado=linea;
            }
            br.close();
            is.close();
            return resultado;
        } catch (IOException e) {
            System.out.println("error al leer el stream is");
        }
        return null;
    }
}

