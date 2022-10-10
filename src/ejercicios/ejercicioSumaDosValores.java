package ejercicios;

public class ejercicioSumaDosValores {

    public static void main(String[] args) {
        programaSumarDosValores ps1 = new programaSumarDosValores(1,5);
        programaSumarDosValores ps2 = new programaSumarDosValores(6,10);
        //-----------------------------------------
        try {
            boolean b1 = ps1.getP().isAlive();
            boolean b2 = ps2.getP().isAlive();
            System.out.println("el proceso1 esta vivo?" + b1);
            System.out.println("el proceso2 esta vivo?" + b2);

            //---------------------------------------------------
            int valorSalidaP1 = ps1.getP().waitFor();
            int valorSalidaP2 = ps2.getP().waitFor();
            //--------------------------------------------------
            System.out.println("valor de salida del proceso1 ->" + valorSalidaP1);
            System.out.println("valor de salida del proceso2 ->" + valorSalidaP2);
            b1 = ps1.getP().isAlive();
            b2 = ps2.getP().isAlive();
            System.out.println("el proceso1 esta vivo?" + b1);
            System.out.println("el proceso2 esta vivo?" + b2);
            //---------------------------------------------------
            //ps1.getP().destroy();
            // ps2.getP().destroy();

            int valordevuelto1 = ps1.recogerValorSalida();
            System.out.println("valor de salida del proceso1 -> " + valordevuelto1);
            int valordevuelto2 = ps2.recogerValorSalida();
            System.out.println("valor de salida del proceso2 -> " + valordevuelto2);
            int sumaFinal = valordevuelto1 + valordevuelto2;
            System.out.println("la suma vale: " + sumaFinal);

        } catch (InterruptedException e) {
            System.out.println("no pude esperar a que los procesos acabaran");
            e.printStackTrace();
        }

    }
}
