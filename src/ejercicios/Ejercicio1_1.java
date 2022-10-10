package ejercicios;

public class Ejercicio1_1 {
    public static void main(String[] args){
        if (args.length == 2){
            try {
                int x = Integer.valueOf(args[0]);
                int y = Integer.valueOf(args[1]);
                if (x > y) {
                    System.out.println(x);
                } else {
                    System.out.println(y);
                }
            }
            catch (NumberFormatException e){
                System.out.println("0");
            }
        }

    }
}
