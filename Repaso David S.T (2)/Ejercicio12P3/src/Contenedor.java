import java.util.Arrays;

public class Contenedor<T> implements Pila<T> {
    T[] table;

    Contenedor(T[] table) {
        this.table = table;
    }

    void insertarAlPrincipio(T nuevo) {
        table = Arrays.copyOf(table, table.length + 1);
        System.arraycopy(table, 0, table, 1, table.length - 1);
        table[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        table = Arrays.copyOf(table, table.length + 1);
        table[table.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T result = table[0];
        table[0] = null;
        System.arraycopy(table, 1 , table , 0, table.length - 1);
        table = Arrays.copyOf(table , table.length - 1);

        return result;
    }

    T extraerDelFinal() {
        T result = table[table.length - 1];
        table[table.length - 1] = null;
        table = Arrays.copyOf(table , table.length - 1);

        return result;
    }

    void ordenar() {
        Arrays.sort(table);
    }

    @Override
    public void apilar(T nuevo) {
        insertarAlPrincipio(nuevo);
    }

    @Override
    public T desapilar() {
        return extraerDelPrincipio();
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }
}
