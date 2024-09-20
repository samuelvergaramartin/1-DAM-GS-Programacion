import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");

        edad = sc.nextInt();

        edad++;

        System.out.println("Dentro de un año tendrás " + edad + " años");
    }
}