/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadPropuesta3P3 {
    public static void main(String[] args) {
        int num, digito;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();
        while (num > 0) {
            digito = num % 10;
            System.out.println(digito); 
            num /= 10;
            }
        sc.close();
        System.exit(0);
    }
}
