import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        double radio, altura, resultado;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce el radio: ");
        radio = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();

        do {
            System.out.print("Seleccione una opción (1 - Área, 2 - Volumen): ");
            opcion = sc.nextInt();
        }
        while (opcion != 1 && opcion != 2);

        if(opcion == 1) resultado = area(altura, radio);
        else resultado = volumen(altura, radio);

        System.out.println("El resultado es: " + resultado);
    }

    private static double area(double altura, double radio) {
        double result;
        result = 2 * Math.PI * radio * (altura + radio);

        return result;
    }
    private static double volumen(double altura, double radio) {
        double result;
        result = Math.PI * Math.pow(radio, 2) * altura;

        return  result;
    }
}