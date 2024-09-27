import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, altura, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base: ");
        base = sc.nextInt();

        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();

        area = base * altura;

        System.out.println("El area del rectangulo es " +  area);
    }
}