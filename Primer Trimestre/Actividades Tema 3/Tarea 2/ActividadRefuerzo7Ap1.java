/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo7Ap1 {
    public static void main(String[] args) {
        final int combinacion = 1707, numIntentosMaximos = 4;
        final String success = "La caja fuerte se ha abierto satisfactioriamente", error = "Lo siento, esa no es la combinacion",
        crash = "Se agotaron los intentos: Program exited with status code 1";
        int numIntento = 1,combinacionIntroducida;
        Scanner sc = new Scanner(System.in);

        while(numIntento != 5) {
            System.out.print("Introduce la combinacion secreta: ");
            combinacionIntroducida = sc.nextInt();

            if(combinacionIntroducida == combinacion) {
                System.out.println(success);
                sc.close();
                System.exit(0);
            }
            else {
                if(numIntento == numIntentosMaximos) {
                    System.out.println(crash);
                    sc.close();
                    System.exit(1);
                }
                numIntento++;
                System.out.println(error);
            }
        }
    }
}