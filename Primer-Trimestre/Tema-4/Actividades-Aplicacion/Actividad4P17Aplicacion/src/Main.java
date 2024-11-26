import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2;
        boolean amigos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num1 = sc.nextInt();

        System.out.print("Introduce otro numero: ");
        num2 = sc.nextInt();

        amigos = sonAmigos(num1, num2);

        if(amigos) System.out.println(num1 + " y " + num2 + " son amigos.");
        else System.out.println(num1 + " y " + num2 + " no son amigos.");
    }

    private static boolean sonAmigos(int num1, int num2) {

    }
}