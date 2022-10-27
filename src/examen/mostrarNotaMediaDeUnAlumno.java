package examen;

import java.io.*;

public class mostrarNotaMediaDeUnAlumno {
    public static void main(String[] args) throws IOException {
        try {
            File datos = new File("C:\\Users\\DAM2\\IdeaProjects\\F1\\out\\production\\F1\\examen\\notas.csv");
            FileReader fl = new FileReader(datos);
            BufferedReader br = new BufferedReader(fl);
            String linea = "";

            while ((linea = br.readLine()) != null) {
                String nombreA = args[1];
                dividirInfo(linea, nombreA);
            }
        fl.close();
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static double dividirInfo(String linea, String nombreA) {
        String linea2 = linea;
        String[] columnas = linea2.split(";");
        String alumno = columnas[0];
        String alumnoC = nombreA;
        double notas1 = Double.parseDouble(columnas[1]);
        double notas2 = Double.parseDouble(columnas[2]);
        double notas3 = Double.parseDouble(columnas[3]);

        if (alumno.equalsIgnoreCase(alumnoC)) {
            double media = (notas1 + notas2 + notas3) / 3;
            System.out.println("Nota media de " + alumno + " es de: " + media);
            System.out.println(" -------------------------------------------- ");

            return media;
        }
        else {
            return 0;
        }
    }
}

