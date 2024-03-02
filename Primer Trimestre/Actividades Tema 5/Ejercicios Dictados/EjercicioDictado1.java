/***
 * @author Samuel Vergara Martín
 * @see - 1 - Haz un programa que lea desde teclado de 10 alumnos y las muestre en pantalla.
 */
import java.util.Scanner;
public class EjercicioDictado1 {
    public static void main(String[] args) {
        int notas[],notaIntroducida;
        notas = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<notas.length;i++) {
            System.out.print("Introduce una nota: ");
            notaIntroducida = sc.nextInt();
            notas[i] = notaIntroducida;
        }
        sc.close();
        System.out.println("Notas introducidas: ");
        for(int i = 0; i<notas.length;i++) {
            System.out.print(notas[i] + " ");
        }
    }
}