import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int altura, base;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca la altura de la pirámide: ");
            altura = sc.nextInt();
        }
        while (altura < 1 || altura > 10);

        //Bucle que controla las filas de la pirámide
        for(int i = 1; i <= altura; i++) {

            //Bucle para controlar los espacios
            for(int x = 1; x <= (altura -i); x++) {
                System.out.print(" ");
            }

            //Dibujar izquierda más el medio
            for(int x = i; x >= 1; x--) {
                base = x +2;
                if(base >= 10) base-=10;
                System.out.print(base);
            }

            //Dibujar derecha
            for(int x = 2; x <= i; x++) {
                base = x +2;
                if(base >= 10) base-=10;
                System.out.print(base);
            }

            System.out.println();
        }
    }
}