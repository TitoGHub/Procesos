package examen;

public class lanzarProcesosNotaMediaDeUnAlumno {
    public static void main(String[] args) {
        String nombrefichero = "C:\\Users\\DAM2\\IdeaProjects\\F1\\out\\production\\F1\\examen\\notas.csv";
        //String nombrefichero = "src/examen/notas.csv";
        procesoNotaMediaDeUnAlumno pmnm1 = new procesoNotaMediaDeUnAlumno(nombrefichero, "pepe");
        procesoNotaMediaDeUnAlumno pmnm2 = new procesoNotaMediaDeUnAlumno(nombrefichero, "carlos");
        procesoNotaMediaDeUnAlumno pmnm3 = new procesoNotaMediaDeUnAlumno(nombrefichero, "ana");
        procesoNotaMediaDeUnAlumno pmnm4 = new procesoNotaMediaDeUnAlumno(nombrefichero, "maria");
        procesoNotaMediaDeUnAlumno pmnm5 = new procesoNotaMediaDeUnAlumno(nombrefichero, "juan");


    }
}
