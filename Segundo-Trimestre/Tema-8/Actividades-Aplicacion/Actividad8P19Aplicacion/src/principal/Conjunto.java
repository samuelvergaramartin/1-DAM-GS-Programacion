package principal;

import superclases.Lista;

public class Conjunto extends Lista {

    @Override
    public void insertarAlFinal(int numero) {
        if(!estaEnElConjunto(numero)) super.insertarAlFinal(numero);
        else System.out.println("Error: El elemento ya está en el conjunto.");
    }

    @Override
    public void insertarAlPrincipio(int numero) {
        if(!estaEnElConjunto(numero)) super.insertarAlPrincipio(numero);
        else System.out.println("Error: El elemento ya está en el conjunto.");
    }

    @Override
    public void insertarPorIndice(int numero, int indice) {
        if(!estaEnElConjunto(numero)) super.insertarPorIndice(numero, indice);
        else System.out.println("Error: El elemento ya está en el conjunto.");
    }

    @Override
    public void insertarAlFinalOtraLista(Lista lista) {
        int indice = 0;

        while (indice < lista.obtenerNumeroElementos() && !estaEnElConjunto(lista.obtenerNumeroPorIndice(indice))) {
            indice++;
        }

        if(indice == obtenerNumeroElementos()) {
            super.insertarAlFinalOtraLista(lista);
        }
        else System.out.println("Error: Uno o más elementos de la lista proporcionada ya están en el conjunto.");
    }

    private boolean estaEnElConjunto(Integer elemento) {
        return obtenerIndicePrimeraOcurrencia(elemento) != -1;
    }
}
