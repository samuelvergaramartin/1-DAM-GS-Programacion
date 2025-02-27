package principal;

import superclases.Cola;

public class ColaDoble extends Cola {

    public void encolarPrincipio(Integer elemento) {
        insertarAlPrincipio(elemento);
    }

    public Integer desencolarFinal() {
        Integer elemento = null;

        if(lista.length > 0) {
            elemento = lista[lista.length - 1];
            eliminarPorIndice(lista.length - 1);
        }

        return elemento;
    }
}
