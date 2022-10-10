package ejercicios;

public class Ejercicio1_1v3 {

        public static void main(String[] args){
            int x1 = 4;
            int y1 = 8;
            int x2 = 2;
            int y2 = 5;

            ProcesoMayor pm1 = new ProcesoMayor(x1,y1);
            ProcesoMayor pm2 = new ProcesoMayor(x2,y2);
            String valor1 = pm1.recogerValorSalida();
            String valor2 = pm2.recogerValorSalida();


        }
}
