import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> cola = new Contenedor<>(new Integer[0]);
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

        while (num != -1) {
            cola.encolar(num);
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        }

        System.out.println("Desencolando...");

        while (cola.cima() != null) {
            System.out.println(cola.desencolar());
        }
    }
}