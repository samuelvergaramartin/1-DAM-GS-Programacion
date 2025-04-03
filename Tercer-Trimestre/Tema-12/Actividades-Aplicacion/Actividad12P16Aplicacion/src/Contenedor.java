import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Contenedor <T> {
    private List<T> contenedor;

    public Contenedor() {
        contenedor = new ArrayList<>();
    }

    public boolean insertarElemento(T elemento) {
        boolean insertado = false;

        if(!contenedor.contains(elemento)) {
            contenedor.add(elemento);
            insertado = true;
        }

        return insertado;
    }

    public T obtenerElemento(int indice) {
        T elemento = null;

        if (indice < contenedor.size() && indice >= 0) {
            elemento = contenedor.get(indice);
        }
        return elemento;
    }

    public boolean eliminarElemento(int indice) {
        boolean eliminado = false;
        T elem;

        if (indice < contenedor.size() && indice >= 0) {
            if(contenedor.contains(obtenerElemento(indice))) {
                contenedor.remove(indice);
                //System.out.println("Leyendo..." +  elem);
                eliminado = true;
            }
        }

        return eliminado;
    }

    public boolean modificarElemento(int indice, T elemento) {
        boolean modificado = false;

        if (indice < contenedor.size() && indice >= 0) {
            contenedor.set(indice, elemento);
        }

        return modificado;
    }

    public int obtenerNumeroElementos() {
        return contenedor.size();
    }

    public void ordenar(Comparator<T> comparator) {
        contenedor.sort(comparator);
    }

    @Override
    public String toString() {
        return contenedor.toString();
    }
}
