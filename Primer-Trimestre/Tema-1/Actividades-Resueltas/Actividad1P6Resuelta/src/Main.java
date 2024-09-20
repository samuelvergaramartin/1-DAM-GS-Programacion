import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");

        nota1 = sc.nextInt();

        System.out.print("Introduce la segunda nota: ");

        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2.0;

        System.out.println("La nota media es: " + media);
    }
}