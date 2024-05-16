import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for(int i = 0;i < 10; i++) {
            numeros.add(i);
        }

        System.out.println(numeros);

        Collections.swap(numeros, 0, 4);

        System.out.println(numeros);

        Collections.replaceAll(numeros, 4, 10);

        System.out.println(numeros);

        List<Integer> numeros2 = new ArrayList<>();
        for(int i = 0; i < 10 ; i++) {
            numeros2.add(i);
        }

        System.out.println("Numero d 2: " + numeros2);
        Collections.fill(numeros2 , 10);
        System.out.println("Fill: " + numeros2);

        List<Integer> numeros3 = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            numeros3.add(i);
        }

        System.out.println("Numeros 3: " + numeros3);
        Collections.copy(numeros2, numeros3);
        System.out.println("Numeros 2: " + numeros2);

        //Otras utilidades

        Collections.shuffle(numeros2);
        System.out.println("Suffle: " + numeros2);

        System.out.println("Cantidad de 10: " +  Collections.frequency(numeros2, 10));
        System.out.println("Maximo; " + Collections.max(numeros2));
        Collections.reverse(numeros2);
        System.out.println(numeros2);



        numeros2.removeAll(Collections.singleton(10));
        System.out.println(numeros2);
    }
}