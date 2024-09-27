import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        num = sc.nextInt();

        if(num %2 == 0) System.out.println("Es par");
        else System.out.println("Es impar");
    }
}