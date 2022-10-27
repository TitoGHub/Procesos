package examen;

import java.io.File;
import java.io.IOException;

public class procesoNotaMediaDeUnAlumno {

    public procesoNotaMediaDeUnAlumno(String nombrefichero, String alumno){
        try {
        ProcessBuilder pb = new ProcessBuilder("java", "examen/mostrarNotaMediaDeUnAlumno", nombrefichero, alumno);
        File f = new File("C:\\Users\\DAM2\\IdeaProjects\\F1\\out\\production\\F1");
        pb.directory(f);
            Process p = pb.start();
       Utilidades.mostrarSalidaProcesoConBuffer(p);
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
