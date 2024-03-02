/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class RefuerzoSwitch1Ap2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota del 0 al 10: ");
        num = sc.nextInt();
        String respuesta = switch(num) {
            case 0 -> {
                yield "cero";
            }
            case 1 -> {
                yield "uno";
            }
            case 2 -> {
                yield "dos";
            }
            case 3 -> {
                yield "tres";
            }
            case 4 -> {
                yield "cuatro";
            }
            case 5 -> {
                yield "cinco";
            }
            case 6 -> {
                yield "seis";
            }
            case 7 -> {
                yield "siete";
            }
            case 8 -> {
                yield "ocho";
            }
            case 9 -> {
                yield "nueve";
            }
            case 10 -> {
                yield "diez";
            }
            default -> {
                yield "Nota no valida";
            }
        };

        System.out.println(respuesta);
        sc.close();
        System.exit(0);
    }
}
