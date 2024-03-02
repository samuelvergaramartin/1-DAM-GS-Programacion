/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P5 {
	public static void main(String[] args) {
		int result,op1,op2,nOperaciones = 0;
		Scanner sc = new Scanner(System.in);

		do {
			op1 = (int) (Math.random() * 100 +1);
			op2 = (int) (Math.random() * 100 +1);
			System.out.print("Introduzca el resultado de la suma de " + op1 +  " y " + op2);
			result = sc.nextInt();
			nOperaciones++;
		}
		while(result == op1 + op2);
		System.out.println("Has conseguido realizar " + (nOperaciones - 1) + " sumas consecutivas.");
		sc.close();
		System.exit(0);
	}
}
