import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10], indices;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        indices = buscarTodos(numeros, 3);

        System.out.println(Arrays.toString(indices));
    }

    public static int[] buscarTodos(int t[], int clave) {
        int indices[] = new int[0];

        for(int i = 0; i < t.length; i++) {
            if(t[i] == clave) {
                indices = Arrays.copyOf(indices, indices.length + 1);
                indices[indices.length - 1] = i;
            }
        }

        return indices;
    }
}