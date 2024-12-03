import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        altura = sc.nextInt();

        for(int i = 1; i <= altura; i++) {
            for(int x = 1; x <= altura - i; x++) {
                System.out.print(" ");
            }

            for(int x = ((altura - i) + 1); x <= altura; x++) {
                System.out.print("*");
            }

            

            System.out.println();
        }
    }
}