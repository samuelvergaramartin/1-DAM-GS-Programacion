/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo23 {
    public static void main(String[] args) {
        int num,suma = 0,cont = 0;
        Scanner sc = new Scanner(System.in);

        while(suma < 10000) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            suma+=num;
            cont++;
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Total de numeros introducidos: " + cont);
        System.out.println("Media: " + suma / cont);
        sc.close();
        System.exit(0);
    }
}
