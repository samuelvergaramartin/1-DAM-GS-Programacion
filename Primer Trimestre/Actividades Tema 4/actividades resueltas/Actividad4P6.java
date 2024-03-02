/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad4P6 {
    public static void main(String[] args) {
        int num;
        boolean resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        sc.close();

        resultado = primo(num);

        System.out.println(resultado);

        System.exit(0);
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
}
