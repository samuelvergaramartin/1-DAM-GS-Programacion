import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numDivisoresPrimos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        numDivisoresPrimos = divisoresPrimos(num);

        System.out.println("El número " + num + " tiene " + numDivisoresPrimos + " divisores primos.");
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

    private static int divisoresPrimos(int num) {
        int resultado = 0;

        for(int i = 2; i <= num; i++) {
            if(esPrimo(i) && num % i == 0) resultado++;
        }

        return resultado;
    }
}