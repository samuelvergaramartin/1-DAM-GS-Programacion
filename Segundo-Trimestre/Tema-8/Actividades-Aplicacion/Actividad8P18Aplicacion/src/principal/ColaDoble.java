package principal;

import superclases.Cola;

public class ColaDoble extends Cola {
    private Integer lista[];

    public ColaDoble() {
        actualizarDireccionMemoria();
    }

    public void encolarPrincipio(Integer elemento) {
        insertarAlPrincipio(elemento);
        actualizarDireccionMemoria();
    }

    public Integer desencolarFinal() {
        Integer elemento = null;

        if(lista.length > 0) {
            elemento = lista[lista.length - 1];
            eliminarPorIndice(lista.length - 1);
            actualizarDireccionMemoria();
        }

        return elemento;
    }

    @Override
    public void actualizarDireccionMemoria() {
        super.actualizarDireccionMemoria();
        lista = super.lista;
    }
}
