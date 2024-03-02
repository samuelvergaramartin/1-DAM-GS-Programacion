/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion3P18 {
    public static void main(String[] args) {
        int a,b,n = 0,maximoComunDivisor = 0,resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        a = sc.nextInt();

        System.out.print("Introduce el valor de b: ");
        b = sc.nextInt();

        sc.close();

        if(a <= b) {
            n = a;
        }
        else if(b < a) {
            n = b;
        }

        maximoComunDivisor = n;

        while(!((a%n == 0) && (b%n == 0))) {
            n--;
        }

        maximoComunDivisor = n;

        resultado = (a * b)/maximoComunDivisor;
        
        System.out.println("El maximo comun divisor de " + a + " y " + b + " es " + resultado);
        System.exit(0);
    }
}
