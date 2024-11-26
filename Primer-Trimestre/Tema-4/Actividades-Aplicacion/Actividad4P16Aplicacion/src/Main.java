import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        divisoresPrimos(num);
    }

    private static boolean esPrimo(int num) {
        int contador = 0;
        boolean resultado = false;


        for(int j = 1; j <= num; j++) {
            if(num%j == 0) contador++;
        }

        if(contador <= 2) resultado = true;

        return resultado;
    }

    private static void divisoresPrimos(int num) {
        int resultado = 0;

        for(int i = 2; i <= num; i++) {
            if(esPrimo(i) && num % i == 0) System.out.println(i);
        }
    }
}