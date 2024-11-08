import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de L: ");
        altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            if(i == altura) {
                for(int x = 1; x <= (i/2)+1; x++) {
                    System.out.print("* ");
                }
            }
            else System.out.println("*");
        }
    }
}