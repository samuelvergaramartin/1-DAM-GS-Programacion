import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);

        num1 = pedirNumero(sc);
        num2 = pedirNumero(sc);

        res = suma(num1, num2);

        System.out.println(res);

    }
    static int suma(int num1, int num2) {
        int res = num1 + num2;

        return res;
    }

    static int pedirNumero(Scanner sc) {
        System.out.print("Introduce un número: ");
        return sc.nextInt();
    }
}