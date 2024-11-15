import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas veces quieres que se repita 'Eco'?: ");
        num = sc.nextInt();

        eco(num);
    }

    private static void eco(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Eco...");
        }
    }
}