/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo26 {
    public static void main(String[] args) {
        /*int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero");
        num = sc.nextInt();

        for(int dig = 1; true; dig++) {
            
        }*/

        int num,resto = 0,digito,posicion = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        System.out.print("Introduce un digito del numero introducido anteriormente: ");
        digito = sc.nextInt();

        sc.close();

        while(num > 0) {
            resto = num % 10 + resto*10;
            num /= 10;
            posicion++;
        }

        for(int i = 1; i <= posicion; i++) {
            if(resto % 10 == digito) {
                System.out.println("Posicion: " + i);
            }
            resto/=10;
        }
        System.exit(0);

    }
}
