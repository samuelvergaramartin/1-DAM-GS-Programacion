public class Contenedor<T extends Comparable> {
    private T objeto;

    public void guardar(T nuevo) {
        objeto = nuevo;
    }

    public T extraer() {
        T res = objeto;
        objeto = null;

        return res;
    }
}
