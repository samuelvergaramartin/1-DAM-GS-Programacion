import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso4 {
    public static void main(String[] args) {
        double num1,num2,resultSuma,resultResta,resultMultplicacion,resultDivison;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce otro numero: ");
        num2 = sc.nextDouble();

        resultSuma = num1 + num2;
        resultResta = num1 - num2;
        resultDivison = num1 / num2;
        resultMultplicacion = num1 * num2;

        System.out.println(num1 + " + " + num2 + " = " + resultSuma);
        System.out.println(num1 + " - " + num2 + " = " + resultResta);
        System.out.println(num1 + " X " + num2 + " = " + resultMultplicacion);
        System.out.println(num1 + " / " + num2 + " = " + resultDivison);

        sc.close();
    }
}
