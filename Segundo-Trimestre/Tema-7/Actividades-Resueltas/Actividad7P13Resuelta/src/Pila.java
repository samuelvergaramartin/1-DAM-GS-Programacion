public class Pila {
    private Lista pila = new Lista();

    public void apilar(int numero) {
        pila.insertarAlPrincipio(numero);
    }

    public Integer desapilar() {
        Integer numero = null;

        if(estaVacia()) System.out.println("Error: La pila está vacía.");
        else {
            numero = pila.obtenerNumeroPorIndice(0);
            pila.eliminarPorIndice(0);
        }

        return numero;
    }

    public Integer obtenerCima() {
        return estaVacia() ? null : pila.obtenerNumeroPorIndice(0);
    }

    public int obtenerNumeroElementos() {
        return pila.obtenerNumeroElementos();
    }

    public boolean estaVacia() {
        return pila.obtenerNumeroElementos() == 0;
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}
