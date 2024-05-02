import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer tabla[] = new Integer[0];
        Contenedor<Integer> miCola = new Contenedor<>(tabla);
        Scanner sc = new Scanner(System.in);
        int n, introducidos = 0;

        System.out.println(miCola.toString());
        System.out.println("Encolando numeros...");

        do {
            System.out.print("Introduzca un numero entero positivo: ");
            n = sc.nextInt();
            if(n > 0) {
                miCola.encolar(n);
                introducidos++;
            }
        }
        while (n != -1);

        System.out.println(miCola.toString());
        System.out.println("Desencolando numeros...");

        do {
            n = miCola.desencolar();
            System.out.println(n);
            introducidos--;
        }
        while (introducidos > 0);

        System.out.println(miCola.toString());
    }
}