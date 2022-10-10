package ejercicios;

import java.io.*;

public class ProgramaVocales {
    public static void main(String[] args) throws IOException {
        if (args.length > 200){
            System.out.println("Número de parámetros incorrectos, error");
        }
        else {
            String nombref = args[0];
            String letrabuscar = args[1];
            File f = new File(nombref);
            if (f.exists() && f.canRead() && f.isFile()) {
                try {
                    int contador = 0;
                    char letra = letrabuscar.charAt(0);
                    FileReader fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);
                    String linea = "";
                    while((linea = br.readLine()) != null){
                            //recorro la línea buscando la letra especifica
                            for(int i=0; i<linea.length();i++){
                                if(linea.charAt(i) == letra){
                                    contador++;
                                }
                            }
                    }
                    br.close();
                    fr.close();
                    System.out.println("Hay un total de: " + contador + " veces la vocal " + letra);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println("error al leer fichero");
            }
        }
    }
}
