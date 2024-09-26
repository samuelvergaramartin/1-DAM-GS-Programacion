import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m1,m2,m3, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la primera medida: ");
        m1 = sc.nextDouble();

        System.out.print("Introduzca la segunda medida: ");
        m2 = sc.nextDouble();

        System.out.print("Introduzca la tercera medida: ");
        m3 = sc.nextDouble();

        result= (m1/10) + m2 + (m3 * 10);

        System.out.println("La suma total en centimetros es: " + result + " cm");
    }
}