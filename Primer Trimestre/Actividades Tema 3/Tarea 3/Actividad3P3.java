/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad3P3 {
    public static void main(String[] args) {
        int numSecreto, num;
        Scanner sc = new Scanner(System.in);

        numSecreto = (int) Math.random() * 100 + 1;

        System.out.print("Introduzca un numero entre el 1 y el 100: ");
        num = sc.nextInt();

        while(numSecreto != num && num != -1) {
            if(numSecreto < num) {
                System.out.println("El numero secreto es menor que el numero introducido");
            }
            else {
                System.out.println("El numero screto es mayor que el numero introducido");
            }
            System.out.print("Introduzca otro numero entre el 1 y el 100: ");
            num = sc.nextInt();
        }

        if(numSecreto == num) {
            System.out.println("Felicidades! Has acertado el numero secreto");
        }
        else {
            System.out.println("Game over. Fin de la partida.");
        }

        sc.close();
        System.exit(0);
    }
}
