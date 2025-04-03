import java.util.ArrayList;
import java.util.List;

public class Pila <T> {
    private List<T> pila;

    public Pila() {
        pila = new ArrayList<>();
    }

    public void apilar(T elemento) {
        pila.add(0, elemento);
    }

    public T desapilar() {
        T elemento = null;

        if(!pila.isEmpty()) {
            elemento = pila.remove(0);
        }

        return elemento;
    }

    public T cima() {
        T elemento = null;

        if(!pila.isEmpty()) {
            elemento = pila.get(0);
        }

        return elemento;
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}
