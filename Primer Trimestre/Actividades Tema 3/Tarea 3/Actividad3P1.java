/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;

public class Actividad3P1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = 4;

        while(num != 0) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();

            if(num %2 == 0) {
                System.out.println("El numero " + num + " es par.");
            }
            else {
                System.out.println("El numero " + num + " es impar ");
            }
            if(num >= 0) {
                System.out.println("El numero " + num + " es positivo.");
            }
            else {
                System.out.println("El numero " + num + " es negativo.");
            }
            System.out.println("El cuadrado de " + num + " es " + Math.pow(num,2));
        }

        sc.close();
        System.exit(0);
    }
}