import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Collection<Integer> coleccion = lista;
        Scanner sc = new Scanner(System.in);
        Integer n;
        Iterator<Integer> it;

        do {
            System.out.print("Introduzca un numero entero positivo: ");
            n = sc.nextInt();
            if(n > 0) {
                coleccion.add(n);
            }
        }
        while(n != -1);

        System.out.println(coleccion);

        it = coleccion.iterator();
        while(it.hasNext()) {
            n = it.next();
            if(n%2 == 0) System.out.println(n);
        }

        it = coleccion.iterator();
        while(it.hasNext()) {
            n = it.next();
            if(n%3 == 0) it.remove();
        }

        System.out.println(coleccion);
    }
}