package ejercicios;

public class Ejercicio4ContarVocales {
    public static void main(String[] args) {

        String fichero = "C:\\Users\\DAM2\\IdeaProjects\\F1\\textoAContar.txt";
        ProcesoVocales pv1 = new ProcesoVocales(fichero, "a");
        ProcesoVocales pv2 = new ProcesoVocales(fichero, "u");
        ProcesoVocales pv3 = new ProcesoVocales(fichero, "o");
        ProcesoVocales pv4 = new ProcesoVocales(fichero, "i");
        ProcesoVocales pv5 = new ProcesoVocales(fichero, "e");


    }
}
