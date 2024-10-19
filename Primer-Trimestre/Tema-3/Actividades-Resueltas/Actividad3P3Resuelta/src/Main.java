import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numSecreto;
        Scanner sc = new Scanner(System.in);

        numSecreto = (int) ((Math.random() * 100) + 1);

        System.out.print("Introduzca el número secreto: ");
        num = sc.nextInt();

        while (num != numSecreto && num != -1) {
            if(num >= 1 && num <= 100) {
                if(num > numSecreto) System.out.println("El número introducido es mayor que el número secreto.");
                if(num < numSecreto) System.out.println("El número introducido es menor que el número secreto.");

                System.out.print("Introduzca el número secreto: ");
                num = sc.nextInt();
            }
            else {
                System.out.println("Error: Número introducido inválido. El número debe estar comprendido entre 1 y 100.");

                System.out.print("Introduzca el número secreto: ");
                num = sc.nextInt();
            }
        }

        if(num == numSecreto) System.out.println("Correcto! Has acertado el número secreto!");
        else System.out.println("Te has rendido, el número secreto era " + numSecreto);
    }
}