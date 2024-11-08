import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la U: ");
        altura = sc.nextInt();

        for(int i = 1; i <= altura; i++) {
            if(i < altura) {
                for(int x = 1; x <= altura; x++) {
                    if(x == 1 || x == altura) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
            else {
                for(int x = 1; x <= altura; x++) {
                    if(x!= 1 && x!= altura) System.out.print("*");
                    else System.out.print(" ");
                }
            }

        }
    }
}