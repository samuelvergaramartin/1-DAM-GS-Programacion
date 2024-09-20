import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, numASumar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        numASumar = (num < 7) ? (7 - num) : (7 - (num%7));

        System.out.println(numASumar);
    }
}