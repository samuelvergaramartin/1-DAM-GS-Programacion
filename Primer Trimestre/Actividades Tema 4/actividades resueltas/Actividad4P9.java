/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P9 {
    public static void main(String[] args) {
        int num1,num2,num3,maximo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro: ");
        num2 = sc.nextInt();

        System.out.print("Introduce otro: ");
        num3 = sc.nextInt();

        sc.close();

        maximo = nmax(num1, num2, num3);

        System.out.println("El maximo es: " + maximo);

        System.exit(0);
    }
    static int nmax(int n1,int n2, int n3) {
        int m = 0;
        
        if(n1 > n2 && n1 > n3) {
            m = n1;
        }
        else if(n2 > n1 && n2 > n3) {
            m = n2;
        }
        else if(n3 > n1 &&  n3 > n2) {
            m = n3;
        }

        return m;
    }
}
