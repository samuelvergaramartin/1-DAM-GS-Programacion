import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        boolean par;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza un numero: ");
        num = sc.nextInt();

        par = num % 2 == 0;

        System.out.println(par ? "Es par" : "No es par");
    }
}