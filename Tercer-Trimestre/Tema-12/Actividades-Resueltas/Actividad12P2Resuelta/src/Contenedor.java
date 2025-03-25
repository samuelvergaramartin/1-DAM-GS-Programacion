import java.util.Arrays;

public class Contenedor <T> {
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

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }
}
