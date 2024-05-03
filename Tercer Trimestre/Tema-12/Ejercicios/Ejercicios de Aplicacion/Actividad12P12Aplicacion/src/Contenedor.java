import java.util.Arrays;
import java.util.Comparator;

public class Contenedor<T extends Comparable> {
    private T tabla[];

    Contenedor(T[] tabla) {
        this.tabla = tabla;
    };

    void insertarAlPrincipio(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla , 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarAlFinal(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    T extraerDelPrincipio() {
        T result = tabla[0];
        tabla[0] = null;
        System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        return result;
    }

    T extraerDelFinal() {
        T result = tabla[tabla.length - 1];
        tabla[tabla.length - 1] = null;
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        return result;
    }

    void ordenar() {
        Arrays.sort(tabla);
    }

    void ordenar(Comparator<T> c) {
        Arrays.sort(tabla, c);
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }
}
