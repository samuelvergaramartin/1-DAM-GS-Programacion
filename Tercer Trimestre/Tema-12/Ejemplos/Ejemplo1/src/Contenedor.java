public class Contenedor<T> {
    private T objeto;

    public Contenedor() {};

    void guardar(T objeto) {
        this.objeto = objeto;
    }

    T extraer() {
        T res;
        res = objeto;
        objeto = null;

        return res;
    }
}
