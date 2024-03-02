/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion3P19 {
    public static void main(String[] args) {
        double num,resto = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();

        for(int i = 1; Math.pow(i, 2) <= num; i++) {
            resto = num - Math.pow(i, 2);
        }

        if(resto != 0) {
            System.out.println("El resto es: " + resto);
        }
        else {
            System.out.println("La raiz cuadrada es exacta.");
        }
        sc.close();
        System.exit(0);
    }
}
