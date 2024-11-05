import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2;
        char operador;
        String resultado;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Intrdoduzca el primer valor: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce el segundo valor: ");
        num2 = sc.nextDouble();

        System.out.print("Introduzca el operador (+,-,*,/): ");
        operador = sc.next().charAt(0);

        switch (operador) {
            case '+': resultado = "" + (num1 + num2);
            break;
            case '-': resultado = "" + (num1 - num2);
            break;
            case '*': resultado = "" + (num1 * num2);
            break;
            case '/': {
                if(num2 == 0) resultado = "Error: No se puede dividir entre 0";
                else resultado = "" + (num1 / num2);
            }
            break;
            default: resultado = "Operador Inválido";
            break;
        }

        System.out.println(resultado);
    }
}