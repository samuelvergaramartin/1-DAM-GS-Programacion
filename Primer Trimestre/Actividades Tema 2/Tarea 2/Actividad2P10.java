/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;

public class Actividad2P10 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nota: ");
        nota = sc.nextInt();
        String resultado = switch(nota) {
            case 0,1,2,3,4 -> {
                yield "Insuficiente";
            }
            case 5 -> {
                yield "Suficiente";
            }
            case 6 -> {
                yield "Bien";
            }
            case 7,8 -> {
                yield "Notable";
            }
            case 9,10 -> {
                yield "Sobresaliente";
            }
            default -> {
                yield "Nota no válida";
            }
        };

        sc.close();

        System.out.println(resultado);

        System.exit(0);
    }
}