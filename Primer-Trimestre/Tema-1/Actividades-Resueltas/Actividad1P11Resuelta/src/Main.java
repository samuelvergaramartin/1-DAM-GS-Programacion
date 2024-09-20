import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double beneficioAnualTotal, beneficioSemestral1Manzanas, beneficioSemestral1Peras,
        beneficioSemestral2Manzanas, beneficioSemestral2Peras, kilosManzanas, kilosPeras;
        final double precioKiloManzana = 2.35, precioKiloPera = 1.95;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca los kilos de manzanas vendidos en el primer semestre: ");
        kilosManzanas = sc.nextDouble();

        System.out.print("Introduzca los kilos de peras vendidos en el primer semestre: ");
        kilosPeras = sc.nextDouble();

        beneficioSemestral1Manzanas = kilosManzanas * precioKiloManzana;
        beneficioSemestral1Peras = kilosPeras * precioKiloPera;

        System.out.print("Introduzca los kilos de manzanas vendidos en el segundo semestre: ");
        kilosManzanas = sc.nextDouble();

        System.out.print("Introduzca los kilos de peras vendidos en el segundo semestre: ");
        kilosPeras = sc.nextDouble();

        beneficioSemestral2Manzanas = kilosManzanas * precioKiloManzana;
        beneficioSemestral2Peras = kilosPeras * precioKiloPera;

        beneficioAnualTotal = beneficioSemestral1Manzanas + beneficioSemestral1Peras + beneficioSemestral2Manzanas + beneficioSemestral2Peras;

        System.out.println("Beneficio anual total: " + beneficioAnualTotal);
    }
}