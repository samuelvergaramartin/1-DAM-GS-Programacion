import java.util.Scanner;
/**
 * @author Samuel Vergara Martín
 */
public class Ejercicio3 {
    public static void main(String[] agrs) {
        int nota;
        final int aprobado = 5;
        String msgResult;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota: ");
        nota = sc.nextInt();

        msgResult = nota >= aprobado ? "Aprobado" : "Suspenso";

        System.out.print(msgResult);

        sc.close();

        System.exit(0);
    }
}