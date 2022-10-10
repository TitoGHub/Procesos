package ejercicios;

import java.io.*;

public class programaSumarDosValores {
        private int numero1;
        private int numero2;
        private Process p;
    private int valorDevuelto;


    public programaSumarDosValores(int valor1, int valor2){
        ProcessBuilder pb = new ProcessBuilder("java","ejercicios/sumaDosValores",String.valueOf(numero1),String.valueOf(numero2));
            numero1 = valor1;
            numero2 = valor2;
            File f1 = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
            File f2 = new File ("./F1");
            pb.directory(f2);
            try {
                pb.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public Process getP() {
        return p;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void setP(Process p) {
        this.p = p;
    }

    public int recogerValorSalida() {
        InputStream is = p.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        // String texto = "";
        String linea = "";
        try {
            while ((linea =br.readLine()) != null)
            {
                valorDevuelto =  Integer.valueOf(linea);
                return valorDevuelto;
            }
            return 0;

        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
        }


