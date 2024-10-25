import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota, contador = 0;
        boolean suspenso = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca la nota: ");
            nota = sc.nextInt();
        }
        while ((nota < 0 || nota > 10) && contador < 5);

    }
}