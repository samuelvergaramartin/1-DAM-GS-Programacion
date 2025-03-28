import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        while (num >= 0) {
            lista.add(num);
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }

        System.out.println("Mostrando indices pares y multiplicando por 100 su valor");

        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i) % 2 == 0) {
                System.out.println(i);
                lista.set(i, lista.get(i)*100);
            }
        }

        System.out.println(lista);
    }
}