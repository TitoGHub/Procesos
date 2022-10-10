package ejercicios;

import java.io.*;

public class ProcesoMayor {

    //Atributos de la clase
    private int valor1;
    private int valor2;
    private Process p;
    public ProcesoMayor(int valor1, int valor2) {
        ProcessBuilder pb = new ProcessBuilder("java", "Procesos/Ejercicio1_1", String.valueOf(valor1),String.valueOf(valor2));
        File f = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
        pb.directory(f);
        try {
            p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public String recogerValorSalida() {
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
