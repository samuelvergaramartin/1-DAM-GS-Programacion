import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        desordenar(numeros);
    }

    private static void desordenar(int t[]) {
        int[] resultado = new int[t.length];
        int pos;

        for(int i = 0; i < t.length; i++) {
            do {
                pos = (int) ((Math.random() * t.length));
                if(resultado[i] == 0)
            }
            while (resultado[i] != 0);
        }
    }
}