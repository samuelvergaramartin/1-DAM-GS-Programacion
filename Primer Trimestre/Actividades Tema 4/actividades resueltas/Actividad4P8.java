/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;

public class Actividad4P8 {

    public static void main(String[] args) {
        double num1,num2, resultado;
        int operacion;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        num1 = sc.nextDouble();
        
        System.out.print("Introduce otro numero: ");
        num2 = sc.nextDouble();
        
        System.out.print("Selecciona una operación:\nSi desea realizar una suma, introduzca 1.\nSi desea realizar una resta, introduzca 2.\nSi desea realizar una multiplicacion, introduzca 3.\nSi desea realizar una division, introduzca 4.\nSu opcion: ");
        operacion = sc.nextInt();

        sc.close();
        
        resultado = calculadora(num1, num2, operacion);
        
        System.out.println(resultado);
    }
    static double calculadora(double num1, double num2, int operacion){
        double resultado;

        resultado = switch(operacion) {
            case 1: {
                yield num1 + num2;
            }
            case 2: {
                yield num1 - num2;
            }
            case 3: {
                yield num1 * num2;
            }
            case 4: {
                yield num1 / num2;
            }
            default: {
                yield 0;
            }
        };

        return resultado;
    }
}
