/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadAplicacion3P14 {
    public static void main(String[] args) {
        int num, cont = 2, resto, i = 1;
        Boolean primo = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        num = sc.nextInt();
        sc.close();

        while(i <= num) {
            while((cont < i) && primo) {
                resto = i%cont;
                System.out.println(cont + " " + resto + " " + i);
                if(resto == 0) {
                    primo = false;
                }
                cont++;
            }

            if(primo) {
                System.out.println(i + " -> primo");
            }
            else {
                System.out.println(i + " -> no primo");
            }
            i++;
        }
        System.exit(0);
    }
}
