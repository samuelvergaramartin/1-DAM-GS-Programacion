import java.util.*;

public class Sorteo <T> {
    Set<T> conjunto;

    public Sorteo() {
        conjunto = new TreeSet<>();
    }

    public boolean add(T elemento) {
        return conjunto.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        Set<T> resultado = null;
        List<T> lista;

        if(numPremiados > 0 && numPremiados < conjunto.size()) {
            lista = new ArrayList<>(conjunto);
            Collections.shuffle(lista);
            resultado = new LinkedHashSet<>();
            for(int i = 0; i < conjunto.size(); i++) {
                resultado.add(lista.get(i));
            }
        }

        return resultado;
    }
}
