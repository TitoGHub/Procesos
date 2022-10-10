package Procesos;

public class Ejemplo9 {
    public static void main(String[] args) {
        String texto = "esto es una frase";
        String[] palabras=texto.split("e");

        for (String palabra: palabras) {
            System.out.println(palabra);
        }
    }
}
