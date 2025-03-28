import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Iterator<Integer> it;
        int num;

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        while (num != -1) {
            numeros.add(num);
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }

        System.out.println("Mostrando valores pares...");
        for(Integer e : numeros) {
            if(e%2 == 0) System.out.println(e);
        }

        System.out.println("Eliminando los multiplos de 3...");

        it = numeros.iterator();

        while (it.hasNext()) {
            if(it.next() %3 == 0) it.remove();
        }

        System.out.println("Mostrando Colección resultante...");
        System.out.println(numeros);
    }
}