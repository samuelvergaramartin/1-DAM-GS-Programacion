import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listaCompleta = new ArrayList<>();
        List<String> repetidas = new ArrayList<>();
        List<String> noRepetidas = new ArrayList<>();
        String frase;

        System.out.print("Introduce palabras: ");
        frase = sc.nextLine();

        for(int i = 0; i < frase.split(" ").length; i++) {
            listaCompleta.add(frase.split(" ")[i]);
        }

        for(int i = 0; i < listaCompleta.size(); i++) {
            if(estaRepetida(listaCompleta.get(i), listaCompleta)) {
                if(!estaEnLaLista(listaCompleta.get(i), repetidas)) repetidas.add(listaCompleta.get(i));
            }
            else {
                if(!estaEnLaLista(listaCompleta.get(i), noRepetidas)) noRepetidas.add(listaCompleta.get(i));
            }
        }

        System.out.println("Lista de palabras repetidas: " + repetidas);
        System.out.println("Lista de palabras no repetidas: " + noRepetidas);
    }
    static boolean estaRepetida(String palabra, List<String> listaCompleta) {
        int c = 0;
        boolean resultado = false;
        for(int i = 0; i < listaCompleta.size(); i++) {
            if(palabra.equals(listaCompleta.get(i))) {
                c++;
                if(c > 1) resultado = true;
            }
        }

        return resultado;
    }
    static boolean estaEnLaLista(String palabra, List<String> repetidas) {
        boolean resultado = false;
        for(int i = 0; i < repetidas.size(); i++) {
            if(palabra.equals(repetidas.get(i))) resultado = true;
        }

        return  resultado;
    }
}