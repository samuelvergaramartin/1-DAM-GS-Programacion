/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class EjercicioMenu {
    public static void main(String[] args) {
        int opt = 0;
        double num1,num2,resultado;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n5.-Salir\nIntroduce una opcion: ");
            opt = sc.nextInt();
            if(opt != 5) {
                System.out.print("Introduzca el primer numero: ");
                num1 = sc.nextInt();
                System.out.print("Introduzca el segundo numero: ");
                num2 = sc.nextInt();
                switch(opt) {
                    case 1: {
                        resultado = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + resultado);
                    }
                    break;
                    case 2: {
                        resultado = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + resultado);
                    }
                    break;
                    case 3: {
                        resultado = num1 * num2;
                        System.out.println(num1 + " X " + num2 + " = " + resultado);
                    }
                    break;
                    case 4: {
                        resultado = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + resultado);
                    }
                }
            }
        } while(opt != 5);
        sc.close();
        System.exit(0);
    }
}