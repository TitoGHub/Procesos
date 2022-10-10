package ejercicios;

public class sumaDosValores {
    public static void main(String[] args){
        int suma = 0;
        if (args.length !=2)
        {
            System.out.println(suma);
            return;
        }
        int argumento0 = Integer.valueOf(args[0]);
        int argumento1 = Integer.valueOf(args[1]);
        if (argumento0 > argumento1){
            System.out.println(suma);
            return;
        }
        for (int i = argumento0; i<=argumento1; i++){
            suma=suma+i;
        }
        System.out.println(suma);

    }
}
