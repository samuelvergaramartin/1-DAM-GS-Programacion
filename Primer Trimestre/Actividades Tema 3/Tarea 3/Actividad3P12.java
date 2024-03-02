/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P12 {
    public static void main(String[] args) {
        int nota;
        Boolean suspenso = false;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            System.out.print("Introduce una nota: ");
            nota = sc.nextInt();

            if(nota < 5) {
                suspenso = true;
            }
            if(i == 5) {
                if(suspenso) {
                    System.out.println("Hay suspensos.");
                }
                else {
                    System.out.println("No tenemos ningun suspenso");
                }
            }
        }
        sc.close();
        System.exit(0);
    }
}//ejercicio 3.13 de los resueltos y 10,11,12,13,14 de los de refuerzo.
