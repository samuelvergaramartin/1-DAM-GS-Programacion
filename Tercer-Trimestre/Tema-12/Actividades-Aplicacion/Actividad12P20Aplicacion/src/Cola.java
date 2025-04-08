import java.util.ArrayList;
import java.util.List;

public class Cola<T> {
    private List<T> cola;

    public Cola() {
        cola = new ArrayList<>();
    }

    public void encolar(T elemento) {
        cola.add(elemento);
    }

    public T desencolar() {
        T elemento = null;

        if(!cola.isEmpty()) {
            elemento = cola.remove(0);
        }

        return elemento;
    }

    public T cima() {
        T elemento = null;

        if(!cola.isEmpty()) {
            elemento = cola.get(0);
        }

        return elemento;
    }

    @Override
    public String toString() {
        return cola.toString();
    }
}
