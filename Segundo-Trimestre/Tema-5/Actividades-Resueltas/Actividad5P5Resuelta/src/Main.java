import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int longitud, fin, tabla[];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce la longitud: ");
            longitud = sc.nextInt();
        }
        while (longitud <= 0);

        do {
            System.out.print("Introduce el final del rango: ");
            fin = sc.nextInt();
        }
        while (fin <= 2);

        tabla = rellenaPares(longitud, fin);

        System.out.println(Arrays.toString(tabla));
    }

    private static int[] rellenaPares(int longitud, int fin) {
        int[] tabla = new int[longitud];

        for(int i = 0; i< longitud; i++) {
            do {
                tabla[i] = (int) ((Math.random() * (fin-1)) + 2);
            }
            while (tabla[i] % 2 != 0);

        }

        Arrays.sort(tabla);

        return tabla;
    }
}