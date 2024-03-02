/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P2 {
    public static void main(String[] args) {
        int num1,num2,mayor,menor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        num1= sc.nextInt();

        System.out.print("Escribe otro numero: ");
        num2 = sc.nextInt();

        sc.close();

        mayor = num1 >= num2 ? num1 : num2;
        menor = num1 <= num2 ? num1 : num2;

        secondary(menor, mayor);

        System.exit(0);
    }
    static void secondary(int n1, int n2) {
        for(int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }
}
