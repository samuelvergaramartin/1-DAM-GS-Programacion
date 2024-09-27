import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, result;
        boolean operable;
        String resultadoFinal;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca el primer numero: ");
        num1 = sc.nextDouble();

        System.out.print("Introduzca el segundo numero: ");
        num2 = sc.nextDouble();

        result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + result);

        result = num1 - num2;

        System.out.println(num1 + " - " + num2 + " = " + result);

        result = num1 * num2;

        System.out.println(num1 + " X " + num2 + " = " + result);

        operable = num2 != 0;

        resultadoFinal = operable ? (num1 + " / " + num2 + " = " + (num1/num2)) : "Error: No se puede dividir entre cero";

        System.out.println(resultadoFinal);
    }
}