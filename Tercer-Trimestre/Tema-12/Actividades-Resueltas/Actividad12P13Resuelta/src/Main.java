import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();
        Set<Integer> combinacionesGanadoras;

        for(int i = 1; i <= 100; i++) {
            sorteo.add(i);
        }

        combinacionesGanadoras = sorteo.premiados(5);

        System.out.println(combinacionesGanadoras);
    }
}