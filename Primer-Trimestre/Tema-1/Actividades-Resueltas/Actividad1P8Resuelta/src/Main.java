import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        boolean mayorDeEdad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        edad = sc.nextInt();

        mayorDeEdad = edad >= 18;

        System.out.println(mayorDeEdad);
    }
}