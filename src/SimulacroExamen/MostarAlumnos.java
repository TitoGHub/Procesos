package SimulacroExamen;

public class MostarAlumnos {
    public static void main(String[] args) {
        String nombref = "alumnos_centro.csv";
        ProcesoMostrarAlumnos pma1 = new ProcesoMostrarAlumnos(nombref,"2dam", "grupo2dam.csv");
        ProcesoMostrarAlumnos pma2 = new ProcesoMostrarAlumnos(nombref,"1dam", "grupo1dam.csv");
        ProcesoMostrarAlumnos pma3 = new ProcesoMostrarAlumnos(nombref,"2smr", "grupo2smr.csv");
        ProcesoMostrarAlumnos pma4 = new ProcesoMostrarAlumnos(nombref,"1smr", "grupo1smr.csv");

    }
}
