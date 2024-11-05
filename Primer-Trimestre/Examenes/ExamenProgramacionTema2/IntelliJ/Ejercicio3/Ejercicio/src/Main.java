import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String calificacion = "La calificación del alumno es: ";
        double notaFinal, notaExamenFinal, notaMediaParciales, notaMediaTrabajoDiario;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la nota del examen final: ");
        notaExamenFinal = sc.nextDouble();

        System.out.print("Introduce la nota media de los parciales: ");
        notaMediaParciales = sc.nextDouble();

        System.out.print("Introduce la nota media del trabajo diario: ");
        notaMediaTrabajoDiario = sc.nextDouble();

        //Aquí compruebo si las notas introducidan están dentro del rango normal de notas (0 al 10)
        if((notaExamenFinal >= 0 && notaExamenFinal <= 10) && (notaMediaParciales >= 0 && notaMediaParciales <= 10)
        && (notaMediaTrabajoDiario >= 0 && notaMediaTrabajoDiario <= 10)) {
            notaFinal = 0.6*notaExamenFinal + 0.3*notaMediaParciales + 0.1*notaMediaTrabajoDiario;
            calificacion += switch ((int) Math.round(notaFinal)) {
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
                //Aquí pongo un default que devuelve null porque a pesar de que se que nunca va a llegar, en este tipo de switch estoy obligado a poner un default.
                default -> {
                    yield null;
                }
            };

            System.out.println(calificacion);
        }
        else {
            System.out.println("Error: Una o más de las notas introducidas no son correctas. Deben estar entre 0 y 10");
        }
    }
}