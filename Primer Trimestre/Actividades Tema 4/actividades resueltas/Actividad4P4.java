/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P4 {
    public static void main(String[] args) {
        int num1,num2,maximo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro: ");
        num2 = sc.nextInt();

        sc.close();

        maximo = nmax(num1, num2);

        System.out.println(maximo);

        System.exit(0);
    }
    static int nmax(int n1,int n2) {
        int m;
        
        m = n1 <= n2 ? n2 : n1;

        return m;
    }
}