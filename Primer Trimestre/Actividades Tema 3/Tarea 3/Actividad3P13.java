/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;

public class Actividad3P13 {
    public static void main(String[] args) {
        int nota,aprobados = 0,condicionados = 0,suspensos = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 6; i++) {
            System.out.print("Introduce una nota: ");
            nota = sc.nextInt();

            if(nota < 4) {
                suspensos++;
            }
            if(nota == 4) {
                condicionados++;
            }
            if(nota >= 5) {
                aprobados++;
            }
        }
        System.out.println("Suspensos: " + suspensos + "\nCondicionados: " + condicionados + "\nAprobados: " +  aprobados);
        sc.close();
        System.exit(0);
    }
}