package superclases;

public class Cola extends Lista{
    protected Integer[] lista;

    public Cola() {
        actualizarDireccionMemoria();
    }

    public void encolar(Integer elemento) {
        insertarAlFinal(elemento);
        actualizarDireccionMemoria();
    }

    public Integer desencolar() {
        Integer elemento = null;

        if(lista.length > 0) {
            elemento = lista[0];
            eliminarPorIndice(0);
            actualizarDireccionMemoria();
        }

        return elemento;
    }

    public boolean estaVacia() {
        return lista.length == 0;
    }

    @Override
    public void actualizarDireccionMemoria() {
        lista = super.lista;
    }
}
