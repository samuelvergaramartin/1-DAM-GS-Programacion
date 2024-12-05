import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5], total = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        for(int e : numeros) {
            total+= e;
        }

        System.out.println("El total es: " + total);
    }
}