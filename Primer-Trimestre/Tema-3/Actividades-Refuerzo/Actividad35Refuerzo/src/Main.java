import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Introduce la altura de la X: ");
            altura = sc.nextInt();
        }
        while (altura < 3 && altura%2 == 0);

        //Bucle de control de la altura de la X
        for(int i = 1; i <= altura; i++) {

            for(int j = 1; j <= i; j++) {
                if(j < i) System.out.print(" ");
                else System.out.print("*");
            }

            System.out.println();
        }
    }
}