package ejercicio6examen;
//Importamos Scanner de la API de Java
import java.util.Scanner;
/**
 *
 * @author Sam170703dev
 */
public class Ejercicio6Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos las variables y el Scanner
        int num1,num2,mayor,menor;
        Scanner sc = new Scanner(System.in);
        Boolean divisible;
        
        //Recopilamos los valores de num1 y num2
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        
        //Comprobamos cual de los dos números introducidos es el mayor
        mayor = num1 >= num2 ? num1 : num2;
        menor = num1 <= num2 ? num1 : num2;
        
        //Comprobamos si el mayor es divisible por el menor
        divisible = mayor % menor == 0;
        
        //Mostramos el resultado por consola
        System.out.println("Es el numero " + mayor + " divisible por " + menor + "? " + divisible);
    }
    
}
