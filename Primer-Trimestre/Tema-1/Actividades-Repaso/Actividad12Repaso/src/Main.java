import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double notaPrimerExamen, notaSegundoExamen, notaDeseada;
        final double porcentajePrimerExamen = 0.4, porcentajeSegundoExamen = 0.6;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce la nota del primer examen: ");
        notaPrimerExamen = sc.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
        notaDeseada = sc.nextDouble();

        notaPrimerExamen *= porcentajePrimerExamen;
        notaSegundoExamen = (notaDeseada - notaPrimerExamen) / porcentajeSegundoExamen;

        System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");
    }
}