import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int anioActual, anioNacimiento, edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el año actual: ");
        anioActual = sc.nextInt();

        System.out.print("Introduzca su año de nacimiento: ");
        anioNacimiento = sc.nextInt();

        edad = anioActual - anioNacimiento;

        System.out.println("Tienes " + edad + " años");
    }
}