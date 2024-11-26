import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, resultado;
        int opcion;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        do {
            System.out.println("""
                    ---Menú de opciones---
                    1- Sumar
                    2- Restar
                    3- Multiplicar
                    4- Dividir""");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
        }
        while (opcion < 1 || opcion > 4);

        if(opcion == 4 && num2 == 0) System.out.println("Error: No se puede realizar la operacion. No se puede dividir entre 0.");
        else {
            resultado = calculadora(num1, num2, opcion);
            System.out.println(resultado);
        }
    }

    private static double calculadora(double num1, double num2, int opcion) {
        double resultado;

        switch (opcion) {
            case 1: {
                resultado = num1 + num2;
                break;
            }
            case 2: {
                resultado = num1 - num2;
                break;
            }
            case 3: {
                resultado = num1 * num2;
                break;
            }
            case 4: {
                resultado = num1 / num2;
                break;
            }
            default: {
                resultado = 0;
                break;
            }
        }
        return resultado;
    }
}