/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class Actividad3P4 {
    public static void main(String[] args) {
        double altura,elmasalto;
        int control,controlMasAlto;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduzca la altura del primer arbol: ");
        altura = sc.nextDouble();
        control = 2;
        elmasalto = altura;
        controlMasAlto = control;

        while(altura != -1) {
            System.out.print("Introduzca la altura del arbol numero " + control + ": ");
            altura = sc.nextDouble();
            if(altura == -1) {
                System.out.println("El arbol mas alto es el numero " + controlMasAlto + " de altura " + elmasalto);
                break;
            }
            if(altura > elmasalto) {
                elmasalto = altura;
                controlMasAlto = control;
            }
            control++;
        }
        sc.close();
        System.exit(0);
    }
}
