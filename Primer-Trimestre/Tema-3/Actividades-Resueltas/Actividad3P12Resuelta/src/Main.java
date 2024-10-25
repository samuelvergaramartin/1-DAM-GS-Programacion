import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota, contador = 0;
        boolean suspenso = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca la nota: ");
            nota = sc.nextInt();

            if(nota < 5) suspenso = true;

            contador++;
        }
        while ((nota < 0 || nota > 10) && contador < 5);

        if(suspenso) System.out.println("Sí, hay suspensos.");
        else System.out.println("No, no hay ningún suspenso.");
    }
}