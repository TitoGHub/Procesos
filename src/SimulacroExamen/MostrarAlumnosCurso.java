package SimulacroExamen;

import java.io.*;

public class MostrarAlumnosCurso {
    public static void main(String[] args) {
        File datos = new File("C:\\Users\\DAM2\\IdeaProjects\\F1\\alumnos_centro.csv");
        try {
            FileReader fl = new FileReader(datos);
            BufferedReader br = new BufferedReader(fl);
            for (int i = 0; i <13; i++){
                String linea = br.readLine();
                dividirInfo(linea);
                //System.out.println(linea);
            }




            fl.close();
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static String[] dividirInfo(String linea) {
        String linea2 = linea;
        String[] columnas = linea2.split(";");
        String alumno = columnas[0];
        String curso = columnas[1];
        System.out.print("Alumno: " + alumno);
        System.out.println(" || Curso: " + curso);
        return columnas;
    }

}
