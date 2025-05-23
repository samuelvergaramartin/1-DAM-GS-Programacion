import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int numero, tamanio = (int) ((Math.random() * 11) + 10);//Tamaño entre 10 y 20
        ArrayList<Integer> lista = new ArrayList<>();
        int suma = 0, max, min;
        double media;

        for(int i = 0; i < tamanio; i++) {
            numero = (int) ((Math.random() * 101));
            lista.add(numero);
        }

        max = Collections.max(lista);
        min = Collections.min(lista);

        for(Integer numeroLista : lista) {
            suma += numeroLista;
        }

        media = suma / tamanio;

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }
}