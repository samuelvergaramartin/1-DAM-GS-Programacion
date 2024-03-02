import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso9 {
    public static void main(String[] args) {
        double radio,altura,volumen;
        final double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        String msgResult;
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();

        
        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();

        
        volumen = (pi * Math.pow(radio, 2) * altura) / 3;
        msgResult = radio <= 0 ? 
            "ERROR: El radio debe ser mayor que 0" :
                (
                    altura <= 0 ? 
                        "ERROR: La altura debe ser mayor que 0" :
                            "El volumen del cono es: " + volumen
                );
        
        System.out.println(msgResult);
        System.out.println( "El volumen del cono es: " + volumen);
        sc.close();
    }
}
