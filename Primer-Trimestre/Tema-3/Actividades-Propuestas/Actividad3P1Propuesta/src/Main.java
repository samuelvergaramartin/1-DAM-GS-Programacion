import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 0,min = 0,edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una edad: ");
        edad = sc.nextInt();

        max = edad;
        min = edad;

        while (edad > 0) {
            if(edad > max) max = edad;
            else if(edad < min) min = edad;

            System.out.print("Introduzca una edad: ");
            edad = sc.nextInt();
        }

        System.out.println("Edad máxima: " + max);
        System.out.println("Edad mínima: " + min);
    }
}