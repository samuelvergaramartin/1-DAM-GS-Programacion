import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        hora = sc.nextInt();

        if(hora <=12) {
            System.out.println("Buenos dias");
            System.out.println("¿Qué tal?");
        }

        System.out.println("Vamos a trabajar");
    }
}