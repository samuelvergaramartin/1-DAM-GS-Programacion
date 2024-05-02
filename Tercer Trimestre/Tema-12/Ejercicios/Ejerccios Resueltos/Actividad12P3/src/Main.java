import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer tabla[] = new Integer[0];
        Contenedor<Integer> miPila = new Contenedor<>(tabla);
        Scanner sc = new Scanner(System.in);
        int n, introducidos = 0;

        System.out.println(miPila.toString());
        System.out.println("Apilando numeros...");

        do {
            System.out.print("Introduzca un numero entero positivo: ");
            n = sc.nextInt();
            if(n > 0) {
                miPila.apilar(n);
                introducidos++;
            }
        }
        while(n != -1);
        System.out.println(miPila.toString());
        System.out.println("Desapilando numeros...");

        do {
            n = miPila.desapilar();
            System.out.println(n);
            introducidos--;
        }
        while (introducidos > 0);

        System.out.println(miPila.toString());
    }
}