package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        while (num >= 0) {
            lista.encolar(num);

            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }

        System.out.println("Desencolando numeros...");

        while (lista.obtenerNumeroElementos() > 0) {
            System.out.println(lista.desencolar());
        }
    }
}