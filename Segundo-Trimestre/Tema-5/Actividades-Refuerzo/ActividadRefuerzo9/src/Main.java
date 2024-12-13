import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[8];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        mostrarSiEsParOImpar(numeros);
    }

    private static void mostrarSiEsParOImpar(int numeros[]){
        for(int e : numeros) {
            if(e % 2 == 0) System.out.print(e + ": Par" );
            else System.out.print(e + ": Impar");

            System.out.println();
        }
    }
}