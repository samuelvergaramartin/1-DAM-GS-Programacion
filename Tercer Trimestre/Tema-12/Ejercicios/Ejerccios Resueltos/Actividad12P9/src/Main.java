import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String indices = "";
        char resolve[];
        int n;

        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        while(n > 0) {
            lista.add(n);
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
        }

        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i)%2 == 0) {
                indices += i + ", ";
                lista.set(i, lista.get(i) * 100);
            }
        }

        resolve = indices.toCharArray();
        resolve = Arrays.copyOf(resolve, resolve.length - 2);
        indices = "";

        for(int i = 0; i < resolve.length; i++) {
            indices+= resolve[i];
        }

        resolve = null;

        System.out.println(indices);
        System.out.println(lista);
    }
}