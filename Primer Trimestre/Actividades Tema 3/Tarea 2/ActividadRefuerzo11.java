/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadRefuerzo11 {
    public static void main(String[] args) {
        int num, num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <= 5; i++) {
            System.out.print("Escribe un numero: ");
            num = sc.nextInt();

            if(i == 1) {
                num1 = num;
            }
            if(i == 2) {
                num2 = num;
            }
            if(i == 3) {
                num3 = num;
            }
            if(i == 4) {
                num4 = num;
            }
            if(i == 5) {
                num5 = num;

                System.out.println("Cuadrado de " + num1 + ": " + Math.pow(num1, 2) + "\nCubo de " + num1 + ": " + Math.pow(num1, 3) + "Cuadrado de " + num2 + ": " + Math.pow(num2, 2) + "\nCubo de " + num2 + ": " + Math.pow(num2, 3) + "Cuadrado de " + num3 + ": " + Math.pow(num3, 2) + "\nCubo de " + num3 + ": " + Math.pow(num3, 3) + "Cuadrado de " + num4 + ": " + Math.pow(num4, 2) + "\nCubo de " + num4 + ": " + Math.pow(num4, 3) + "Cuadrado de " + num5 + ": " + Math.pow(num5, 2) + "\nCubo de " + num5 + ": " + Math.pow(num5, 3));
            }
        }
        sc.close();
        System.exit(0);
    }
}
