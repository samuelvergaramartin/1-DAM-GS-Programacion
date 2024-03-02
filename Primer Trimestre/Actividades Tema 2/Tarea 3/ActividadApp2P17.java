/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P17 {
    public static void main(String[] args) {
        int num1, num2, respuesta, suma;
        Scanner sc = new Scanner(System.in);
        
        num1 =(int) (100.0 * Math.random());
        num2 =(int) (100.0 * Math.random());
        suma = num1 + num2;

        System.out.print("Introduzca el resultado de la suda de " + num1 + " y " + num2 + ": ");
        respuesta = sc.nextInt();
        
        System.out.println(respuesta == suma ? "correcta" : "incorrecta");

        sc.close();
        System.exit(0);
    }
}
