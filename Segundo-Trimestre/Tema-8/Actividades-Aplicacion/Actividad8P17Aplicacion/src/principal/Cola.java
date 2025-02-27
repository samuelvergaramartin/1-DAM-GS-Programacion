package principal;

import superclases.Lista;

public class Cola extends Lista{

    public void encolar(Integer elemento) {
        insertarAlFinal(elemento);
    }

    public Integer desencolar() {
        Integer elemento = null;

        if(lista.length > 0) {
            elemento = lista[0];
            eliminarPorIndice(0);
        }

        return elemento;
    }

    public boolean estaVacia() {
        return lista.length == 0;
    }
}
