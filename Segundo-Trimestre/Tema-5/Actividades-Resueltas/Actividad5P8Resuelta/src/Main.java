import static java.util.Arrays.copyOf;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroDeNumeros, pares[] = new int[0], impares[] = new int[0], num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Cuantos numeros deseas introducir?: ");
            numeroDeNumeros = sc.nextInt();
        }
        while (numeroDeNumeros <= 0);

        for(int i = 0; i < numeroDeNumeros; i++) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if(num % 2 == 0) {
                pares = copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = num;
            }
            else {
                impares = copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = num;
            }
        }

        System.out.println(java.util.Arrays.toString(pares));
        System.out.println(java.util.Arrays.toString(impares));
    }
}