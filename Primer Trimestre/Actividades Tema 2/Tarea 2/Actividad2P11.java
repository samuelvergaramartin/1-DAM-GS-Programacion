/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
/*public class Actividad2P11 {
    public static void main(String[] args) {
        int diaSemana;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 7: ");
        diaSemana = sc.nextInt();
        String resultado = switch(diaSemana) {
            case 1 -> {
                yield "Lunes";
            }
            case 2 -> {
                yield "Martes";
            }
            case 3 -> {
                yield "Miercoles";
            }
            case 4 -> {
                yield "Jueves";
            }
            case 5 -> {
                yield "Viernes";
            }
            case 6 -> {
                yield "Sabado";
            }
            case 7 -> {
                yield "Domingo";
            }
            default -> {
                yield "Numero no valido.";
            }
        };

        System.out.println(resultado);
        sc.close();
        System.exit(0);
    }
}*/

 public class Actividad2P11 {
    public static void main(String[] args) {
        int diaSemana;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 7: ");
        diaSemana = sc.nextInt();
        String resultado = switch(diaSemana) {
            case 1: {
                yield "Lunes";
            }
            case 2: {
                yield "Martes";
            }
            case 3: {
                yield "Miercoles";
            }
            case 4: {
                yield "Jueves";
            }
            case 5: {
                yield "Viernes";
            }
            case 6: {
                yield "Sabado";
            }
            case 7: {
                yield "Domingo";
            }
            default: {
                yield "Numero no valido.";
            }
        };

        System.out.println(resultado);
        sc.close();
        System.exit(0);
    }
}
