import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca la altura del rombo (debe ser un numero impar mayor o igual que 3): ");
            altura = sc.nextInt();
        }
        while (altura < 3 || altura % 2 == 0);

        //Dibujamos la parte de arriba del rombo

        //Control de filas
        for(int i = 1; i <= (altura/2) + 1; i++) {
            //Control de columnas

            //Control de espacios
            for(int x = 1; x <= altura-i; x++) {
                System.out.print(" ");
            }
            //Control de *
            for(int x = 1; x <= i; x++) {
                if (x == 1 || x == i) System.out.print("* ");
                else System.out.print("  ");
            }

            //Salto de linea para empezar a dibujar la siguiente fila si esq la hay
            System.out.println();
        }



        //Dibujamos la parte de abajo del rombo

        //Control de filas
        for(int i = (altura-1)/2; i >= 1; i--) {
            //Control de espacios
            for(int x = altura-i; x >= 1; x--) {
                System.out.print(" ");
            }

            //Control de *
            for(int x = i; x >= 1; x--) {
                if (x == 1 || x == i) System.out.print("* ");
                else System.out.print("  ");
            }

            //Salto de linea para empezar a dibujar la siguiente fila si esq la hay
            System.out.println();
        }
    }
}