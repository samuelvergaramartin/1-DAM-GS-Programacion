import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidad, max, min;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de numeros aleatorios a generar: ");
        cantidad = sc.nextInt();

        System.out.print("Introduce el rango minimo: ");
        min = sc.nextInt();

        System.out.print("Introduce el rango maximo: ");
        max = sc.nextInt();

        aleatorio(cantidad, max, min);
    }

    private static void aleatorio(int cantidad, int max, int min) {
        int num;
        for(int i = 1; i <= cantidad; i++) {
            num = (int)((Math.random() * max) + min);
            System.out.println(num);
        }
    }
}