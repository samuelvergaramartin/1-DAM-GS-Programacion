package principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista pila = new Lista();
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        while (num >= 0) {
            pila.apilar(num);
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        }

        while (pila.obtenerNumeroElementos() > 0) {
            System.out.println(pila.desapilar());
        }
    }
}