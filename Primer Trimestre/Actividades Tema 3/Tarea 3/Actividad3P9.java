/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P9 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entre el 1 y el 10: ");
        num = sc.nextInt();

        if(num < 1 || num > 10) {
            sc.close();
            throw new Error("ERROR: El numero introducido debe ser entre el 1 y el 10");
        }

        for(int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + i*num);
        }
        sc.close();
        System.exit(0);
    }
}
