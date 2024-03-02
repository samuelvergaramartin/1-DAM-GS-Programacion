/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P18 {
    public static void main(String[] args) {
         int num1, num2, respuesta, resta, multiplicacion;
         String operacion;  
         Scanner sc = new Scanner(System.in);
               
         num1 =(int) (100.0 * Math.random());
         num2 =(int) (100.0 * Math.random());
 
         System.out.print("Que tipo de operacion quieres hacer (suma, resta o multiplicación): ");
         operacion = sc.next();
         
         switch (operacion) {
             case "suma" -> {
                 int suma = num1 + num2;
                 System.out.print("Introduzca el resultado de la suma de " + num1 + " y " + num2 + ": ");
                 respuesta = sc.nextInt();
                 System.out.println(respuesta == suma ? "correcta" : "incorrecta");
             }
             case "resta" -> {
                 resta = num1 - num2;
                 System.out.print("Introduzca el resultado de la resta de " + num1 + " y " + num2 + ": ");
                 respuesta = sc.nextInt();
                 System.out.println(respuesta == resta ? "correcta" : "incorrecta");                
             }
             case "multiplicación", "multiplicacion" -> {
                 multiplicacion = num1 * num2;
                 System.out.print("Introduzca el resultado de la multiplicación de " + num1 + " y " + num2 + ": ");
                 respuesta = sc.nextInt();
                 System.out.println(respuesta == multiplicacion ? "correcta" : "incorrecta");
             }
         }   
         sc.close();
         System.exit(0);
    }
}
