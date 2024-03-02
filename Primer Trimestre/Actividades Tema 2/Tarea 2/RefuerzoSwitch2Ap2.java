/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class RefuerzoSwitch2Ap2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 12: ");
        num = sc.nextInt();
        String respuesta = switch(num) {
            case 1 -> {
                yield "Enero";
            }
            case 2 -> {
                yield "Febrero";
            }
            case 3 -> {
                yield "Marzo";
            }
            case 4 -> {
                yield "Abril";
            }
            case 5 -> {
                yield "Mayo";
            }
            case 6 -> {
                yield "Junio";
            }
            case 7 -> {
                yield "Julio";
            }
            case 8 -> {
                yield "Agosto";
            }
            case 9 -> {
                yield "Septiembre";
            }
            case 10 -> {
                yield "Octubre";
            }
            case 11 -> {
                yield "Noviembre";
            }
            case 12 -> {
                yield "Diciembre";
            }
            default -> {
                yield "Numero no valida";
            }
        };

        System.out.println(respuesta);
        sc.close();
        System.exit(0);
    }
}
