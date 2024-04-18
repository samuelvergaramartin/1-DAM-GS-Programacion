import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 numeros: ");
        for (int i = 0; i < 5; i ++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numeros));
    }
}