/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P7 {
    public static void main(String[] args) {
        int num,modificable;
        boolean primo, ndivisor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        sc.close();

        modificable = num;
        for(int n = modificable -1; n > 1; n--) {
            ndivisor = divisor(num, n);
            if(ndivisor) {
                primo = primo(n);
                if(primo) {
                    System.out.println(n);
                }
            }
        }
    }
    static boolean primo(int num) {
        int cont = 2, resto;
        boolean primo = true;
            while((cont < num) && primo) {
                resto = num%cont;
                if(resto == 0) {
                    primo = false;
                }
                cont++;
            }

            if(primo) {
                return true;
            }
            else {
                return false;
            }
    }
    static boolean divisor(int num1, int num2) {
        if(num1 % num2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
//Refuerzo.  ejercicio 1