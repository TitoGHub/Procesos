package ejercicios;

import java.io.File;
import java.io.IOException;

public class ProcesoVocales {

    private Process p;
    public ProcesoVocales(String fichero, String letra) {

        try {
        ProcessBuilder pb = new ProcessBuilder("java","-cp","./", "ejercicios/ProgramasVocales",fichero,letra);
        File f = new File("C:/Users/DAM2/IdeaProjects/F1/out/production/F1");
        pb.directory(f);
       // pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        p = pb.start();
        Utilidades.mostrarSalidaProcesoConBuffer(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
