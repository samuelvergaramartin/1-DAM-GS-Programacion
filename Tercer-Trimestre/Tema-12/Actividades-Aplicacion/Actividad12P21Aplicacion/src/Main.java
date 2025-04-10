import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());

        for(int i = 0; i < 20; i++) {
            numeros.add((int)(Math.random() * 100));
        }

        System.out.println(numeros);
    }
}