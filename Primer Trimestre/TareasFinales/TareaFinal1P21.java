import java.util.*;
public class TareaFinal1P21 {
    public static void main(String[] args) {
        double a,b;
        String resultado;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Escribe un numero: ");
        a = sc.nextDouble();

        System.out.print("Escribe otro numero: ");
        b = sc.nextDouble();

        resultado = a == b ? a + " y " + b + " son iguales." : a + " y " + b + " no son iguales";

        System.out.println(resultado);

        sc.close();
    }
}
