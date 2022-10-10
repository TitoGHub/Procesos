package Procesos;

import java.io.File;
import java.io.IOException;

public class Ejemplo3 {
        public static void main(String[] arg){
            ProcessBuilder pb = new ProcessBuilder("java", "Procesos/ProgramaJava");
            File f = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
            pb.directory(f);

            try {
                Process p = pb.start();
                Utilidades.mostrarErroresProcesoConBuffer(p);
                Utilidades.mostrarSalidaProcesoConBuffer(p);
            } catch (IOException e) {
                System.out.println("mp ìde ñamzar eñ proceso");
                throw new RuntimeException(e);
            }

        }
}
