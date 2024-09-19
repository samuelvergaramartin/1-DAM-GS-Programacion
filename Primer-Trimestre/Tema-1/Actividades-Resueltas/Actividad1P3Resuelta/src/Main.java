import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edadActual,edadProxima;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");

        edadActual = sc.nextInt();

        edadProxima = ++edadActual;

        System.out.println("Dentro de un año tendrás " + edadProxima + " años");
    }
}