package principal;

import superclases.Lista;

public class Pila extends Lista {

    public void apilar(Integer elemento) {
        insertarAlPrincipio(elemento);
    }

    public Integer desapilar() {
        Integer elemento = null;

        if(lista.length > 0) {
            elemento = lista[0];
            eliminarPorIndice(0);
        }

        return elemento;
    }

    public Integer obtenerCima() {
        Integer elemento = null;

        if(lista.length > 0) elemento = lista[0];

        return elemento;
    }
}
