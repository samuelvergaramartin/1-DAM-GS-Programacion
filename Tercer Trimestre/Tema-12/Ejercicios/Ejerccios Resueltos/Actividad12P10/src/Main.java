import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaOriginal = new ArrayList<>();
        Set<Integer> sinRepetir = new TreeSet<>();
        List<Integer> repetidas = new ArrayList<>();
        Set<Integer> noRepetidas = new TreeSet<>();
        List<Integer> aux = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            listaOriginal.add((int)((Math.random()) * 10) + 1);
        }

        sinRepetir.addAll(listaOriginal);

        for(int i = 0; i < listaOriginal.size(); i++) {
            if(estaRepetida(listaOriginal.get(i), listaOriginal)) {
                if(!estaEnLaLista(listaOriginal.get(i), repetidas)) repetidas.add(listaOriginal.get(i));
            }
            else {
                if(!estaEnLaLista(listaOriginal.get(i), aux)) aux.add(listaOriginal.get(i));
            }
        }

        noRepetidas.addAll(aux);
        aux.clear();

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Elementos de la lista original sin repetir: " + sinRepetir);
        System.out.println("Elementos repetidos de la lista original: " + repetidas);
        System.out.println("Elementos que solo aparecen una sola vez en la lista original: " + noRepetidas);
    }
    static boolean estaRepetida(Integer n, List<Integer> lista) {
        int c = 0;
        boolean resultado = false;
        for(int i = 0; i < lista.size(); i++) {
            if(n.equals(lista.get(i))) {
                c++;
                if(c > 1) resultado = true;
            }
        }

        return resultado;
    }
    static boolean estaEnLaLista(Integer n, List<Integer> lista) {
        boolean resultado = false;
        for(int i = 0; i < lista.size(); i++) {
            if(n.equals(lista.get(i))) resultado = true;
        }

        return  resultado;
    }
}