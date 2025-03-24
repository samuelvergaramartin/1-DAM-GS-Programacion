import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparaNumeros comparaNumeros = new ComparaNumeros();
        Integer numeros[] = new Integer[20];

        for(int i = 0; i < 20; i ++) {
            numeros[i] = (int) ((Math.random() * 100) + 1);
        }

        Arrays.sort(numeros, comparaNumeros.reversed());

        System.out.println(Arrays.toString(numeros));
    }
}