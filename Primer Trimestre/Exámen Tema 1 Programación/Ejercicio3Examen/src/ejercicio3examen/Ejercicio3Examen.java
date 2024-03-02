package ejercicio3examen;
//Importamos Scanner y Locale de la API de Java
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio3Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos las variables y el Scanner
        double nReal;
        Scanner sc = new Scanner(System.in);
        //Establecemos el formato numérico del Scanner en US
        sc.useLocale(Locale.US);
        
        //Recopilamos el valor del número real
        System.out.print("Introduce un numero real: ");
        nReal = sc.nextDouble();
        
        //Mostramos el resultado por consola, con un ternario que verifica si es Positivo o Negativo
        System.out.println(nReal >= 0 ? "Positivo" : "Negativo");
    }
    
}
