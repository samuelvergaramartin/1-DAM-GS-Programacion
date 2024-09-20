import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");

        nota1 = sc.nextDouble();

        System.out.print("Introduce la segunda nota: ");

        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("La nota media es: " + media);
    }
}