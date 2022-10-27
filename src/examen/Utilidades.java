package examen;

import java.io.*;

public class Utilidades {
    public static void mostrarSalidaProceso(Process p) {
        try {
            InputStream is = p.getInputStream();
            int letra = 0;
            while((letra = is.read()) != -1)
            {
                System.out.print((char)letra);
            }
            is.close();
        } catch (IOException e) {
            System.out.println("error al leer el stream is");
        }
    }
    //-----------------------------------------------------
    public static void mostrarErroresProceso(Process p) {
        try {
            InputStream is = p.getErrorStream();
            int letra = 0;
            while((letra = is.read()) != -1)
            {
                System.out.print((char)letra);
            }
            is.close();
        } catch (IOException e) {
            System.out.println("error al leer el stream is");
        }
    }
    //-------------------------------------------
    public static void mostrarSalidaProcesoConBuffer(Process p)
    {
        try {
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea = br.readLine()) != null)
            {
                System.out.println(linea);
            }
            br.close();
            is.close();
        } catch (IOException e) {
            System.out.println("error al leer el stream is");
        }
    }

    //-------------------------------------------
    public static void mostrarErroresProcesoConBuffer(Process p)
    {
        try {
            InputStream is = p.getErrorStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;
            while((linea = br.readLine()) != null)
            {
                System.out.println(linea);
            }
            br.close();
            is.close();
        } catch (IOException e) {
            System.out.println("error al leer el stream is");
        }

    }

    public static void enviarDatos(Process p, String dato){
        OutputStream os = p.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        try {
            bw.write(dato);
            bw.close();
            osw.close();
            os.close();
        } catch (IOException e) {
            System.out.println("no puder poner el dato en el buffer");
            throw new RuntimeException(e);
        }
    }
}