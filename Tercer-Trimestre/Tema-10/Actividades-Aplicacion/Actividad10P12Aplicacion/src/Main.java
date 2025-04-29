import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader in;
        String nombre;
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        do {
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();
        }
        while (edad <= 0);


    }
}