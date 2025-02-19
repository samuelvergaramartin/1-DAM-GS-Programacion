public class Cola {
    private Lista cola = new Lista();

    public void encolar(int elemento) {
        cola.insertarAlFinal(elemento);
    }

    public Integer desencolar() {
        final Integer elemento = cola.obtenerNumeroPorIndice(0);
        cola.eliminarPorIndice(0);

        return elemento;
    }

    @Override
    public String toString() {
        return cola.toString();
    }
}
