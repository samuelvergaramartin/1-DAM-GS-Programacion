import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input,nombre;
        int edad;
        double estatura;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduzca los datos del deportista: ");
        input = sc.nextLine();

        sc = new Scanner(input);
        sc.useLocale(Locale.US);

        nombre = sc.next();
        edad = sc.nextInt();
        estatura = sc.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
}