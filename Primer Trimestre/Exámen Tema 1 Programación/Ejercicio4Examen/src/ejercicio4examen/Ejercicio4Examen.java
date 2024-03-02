package ejercicio4examen;
//Importamos Scanner y Locale de la API de Java
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio4Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos las variables, la constante y el Scanner
        double precioSinIVA, precioConIVA;
        final double IVA = 0.21;
        Scanner sc = new Scanner(System.in);
        //Establecemos el formato numérico del Scanner en US
        sc.useLocale(Locale.US);
        
        //Recopilamos el valor del precio sin IVA
        System.out.print("Introduce el precio del producto: ");
        precioSinIVA = sc.nextDouble();
        
        //Calculamos el valor del precio con IVA
        precioConIVA = precioSinIVA * IVA + precioSinIVA;
        
        //Mostramos el resultado en consola con formato de 4 decimales e insertamos un salto de línea al final
        System.out.printf("El precio con IVA es %.4f", precioConIVA);
        System.out.print("\n");
    }
    
}
