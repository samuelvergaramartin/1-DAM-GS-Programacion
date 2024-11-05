import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        //Bucle que controla el numero de filas
        for(int i = 1; i <= num; i++) {

            //Pinta tantos espacios como filas - 1
            for(int j = 1; j <= num-i; j++) {
                System.out.print(" ");

            }

            //Casilla que no esté pintada en blanco, se pinta
            for(int z = 1; z <= i; z++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}