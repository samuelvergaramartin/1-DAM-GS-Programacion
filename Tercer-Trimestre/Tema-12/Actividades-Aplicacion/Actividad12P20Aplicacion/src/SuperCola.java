import java.util.ArrayList;
import java.util.List;

public class SuperCola <T> {
    private List<T> cola, cola2;

    public SuperCola() {
        cola = new ArrayList<>();
        cola2 = new ArrayList<>();
    }

    public void encolar(T elemento) {
        cola.add(elemento);
    }

    public void encolar2(T elemento) {
        cola2.add(elemento);
    }

    public T desencolar1() {
        T elemento;

        if(!cola.isEmpty()) {
            elemento = cola.remove(0);
        }
        else elemento = desencolar();

        return elemento;
    }

    public T desencolar2() {
        T elemento;

        if(!cola2.isEmpty()) {
            elemento = cola2.remove(0);
        }
        else elemento = desencolar();

        return elemento;
    }

    public T desencolar() {
        T elemento = null;

        if(!cola.isEmpty()) {
            elemento = cola.remove(0);
        }

        if(!cola2.isEmpty()) {
            elemento = cola2.remove(0);
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

    public T cima2() {
        T elemento = null;

        if(!cola2.isEmpty()) {
            elemento = cola2.get(0);
        }

        return elemento;
    }

    @Override
    public String toString() {
        return cola.toString();
    }
}
