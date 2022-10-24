package SimulacroExamen;

import java.io.File;
import java.io.IOException;

public class ProcesoMostrarAlumnos {

    public ProcesoMostrarAlumnos(String nombref, String curso, String nombref2) {
        //creo el proceso
        ProcessBuilder pb = new ProcessBuilder("java", "SimulacroExamen/MostrarAlumnosCurso", nombref, curso);
        File f = new File ("C:\\Users\\DAM2\\IdeaProjects\\F1\\out\\production\\F1");
        pb.directory(f);
        File f2 = new File(nombref2);
        pb.redirectOutput(f2);

        try {
            Process p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
