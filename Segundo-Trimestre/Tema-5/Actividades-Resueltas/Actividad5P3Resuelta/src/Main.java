import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int totalNumeros, numeros[];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Cuantos numeros quieres introducir?: ");
            totalNumeros = sc.nextInt();
        }
        while (totalNumeros <= 0);

        numeros = new int[totalNumeros];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Mostrando numeros en orden inverso...");

        for(int i = numeros.length -1 ; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}