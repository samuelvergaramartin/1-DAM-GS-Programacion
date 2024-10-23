import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double altura = 0.0, max = 0.0;
        int id = 0, maxId = 0;
        boolean control;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        while (altura != -1) {

            System.out.print("Introduzca la altura del arbolito de id " + id + ": ");
            altura = sc.nextDouble();

            if(altura > 0) {
                if(altura > max) {
                    max = altura;
                    maxId = id;
                }
                id++;
            }
            else {
                if(altura != -1 ) System.out.println("Error: Altura introducida inválida.");
                /*System.out.print("Introduzca la altura del arbolito de id " + id + ": ");
                altura = sc.nextDouble();*/
            }
        }
        System.out.println("El árbol más grande es de " + max + " cm y su ID es " + maxId);
    }
}