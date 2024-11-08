import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, primos = 0, contador;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            contador = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j == 0) contador++;
            }

            if(contador <= 2) {
                primos++;
                System.out.println(i + "--> Primo");
            }
            else System.out.println(i + "--> No primo");
        }

        System.out.println("Hay un total de " + primos + " números primos.");
    }
}