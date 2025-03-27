import java.util.Arrays;
import java.util.Comparator;

public class Contenedor<T extends Comparable <T>> implements Pila <T>{
    T lista[];

    public Contenedor(T[] lista) {
        this.lista = lista;
    }

    public void insertarAlPrincipio(T nuevo) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, 0, lista, 1, lista.length - 1);

        lista[0] = nuevo;
    }

    public void insertarAlFinal(T nuevo) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = nuevo;
    }

    public T extraerDelPrincipio() {
        T elemento = null;

        if(lista.length > 0) {
            elemento = lista[0];
            System.arraycopy(lista, 1, lista, 0, lista.length - 1);
            lista = Arrays.copyOf(lista, lista.length - 1);
        }

        return elemento;
    }

    public T extraerDelFinal() {
        T elemento = null;

        if(lista.length > 0) {
            elemento = lista[lista.length - 1];
            lista = Arrays.copyOf(lista, lista.length - 1);
        }

        return elemento;
    }

    public void ordenar() {
        Arrays.sort(lista);
    }

    public void ordenar(Comparator<T> c) {
        Arrays.sort(lista, c);
    }

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }

    @Override
    public void apilar(T elemento) {
        insertarAlPrincipio(elemento);
    }

    @Override
    public T desapilar() {
        return extraerDelPrincipio();
    }

    @Override
    public T cima() {
        T elemento = null;

        if(lista.length > 0) elemento = lista[0];

        return elemento;
    }
}
