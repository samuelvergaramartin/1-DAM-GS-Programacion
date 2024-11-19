import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, medio;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número positivo: ");
            num = sc.nextInt();
        }
        while (num <= 0);

        //Bucle para controlar las filas
        for(int i = 1; i <= num; i++) {
            //Bucles para controlar las columnas

            //Bucle para controlar los espacios
            for(int j = 1; j <= num -i; j++) {
                System.out.print(" ");
            }
            //Bucle para dibujar los numeros
            medio = i;
            if(medio == 1) {
                for (int x = 1; x <= i; x++) {
                    System.out.print(x);
                }
            }
            else {
                //Bucle para dibujar ala izquierda triangulo y su medio
                for(int x = 1; x <= medio; x++) {
                    System.out.print(x);
                }
                //Dibujamos el ala derecha del triangulo
                for(int x = medio-1; x >= 1; x--) {
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}