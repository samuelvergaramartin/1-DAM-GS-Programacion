package principal;

import interfaces.Cola;
import interfaces.Pila;

import java.util.Arrays;

public class Lista implements Cola, Pila {
    private Object lista[];

    public Lista() {
        lista = new Object[0];
    }

    public int obtenerNumeroElementos() {
        return lista.length;
    }

    public void insertarAlFinal(Object obj) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = obj;
    }

    public void insertarAlPrincipio(Object obj) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, 0, lista, 1, lista.length - 1);
        lista[0] = obj;
    }

    public void insertarPorIndice(Object obj, int indice) {
        if(indice < 0 || indice > lista.length - 1) System.out.println("Error: El indice introducido no existe");
        else {
            lista = Arrays.copyOf(lista, lista.length + 1);
            System.arraycopy(lista, indice, lista, indice + 1, lista.length - indice - 1);
            lista[indice] = obj;
        }
    }

    public void eliminarPorIndice(int indice) {
        if(indice < 0 || indice > lista.length - 1) System.out.println("Error: El indice introducido no existe");
        else {
            System.arraycopy(lista, indice + 1, lista, indice, lista.length - indice - 1);
            lista = Arrays.copyOf(lista, lista.length - 1);
        }
    }

    public Object obtenerElementoPorIndice(int indice) {
        Object resultado = null;

        if(indice < 0 || indice > lista.length - 1) System.out.println("Error: El indice introducido no existe");
        else {
            resultado = lista[indice];
        }

        return resultado;
    }

    public void insertarAlFinalOtraLista(Lista lista) {
        for (int i = 0; i < lista.obtenerNumeroElementos(); i++) {
            insertarAlFinal(lista.obtenerElementoPorIndice(i));
        }
    }

    public int obtenerIndicePrimeraOcurrencia(Object obj) {
        int resultado = -1, indice = 0;
        boolean encontrado = false;

        while (indice < lista.length && !encontrado) {
            if(lista[indice].equals(obj)) {
                encontrado = true;
                resultado = indice;
            }

            indice++;
        }

        return resultado;
    }

    public void mostrarElementos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }

    @Override
    public void encolar(Object elemento) {
        insertarAlFinal(elemento);
    }

    @Override
    public Object desencolar() {
        Object elemento = null;

        if(lista.length > 0) {
            elemento = lista[0];
            eliminarPorIndice(0);
        }

        return elemento;
    }

    @Override
    public Object cima() {
        Object elemento = null;

        if(lista.length > 0) elemento = lista[0];

        return elemento;
    }

    @Override
    public void apilar(Object elemento) {
        insertarAlPrincipio(elemento);
    }

    @Override
    public Object desapilar() {
        Object elemento = null;

        if(lista.length > 0) {
            elemento = lista[0];
            eliminarPorIndice(0);
        }

        return elemento;
    }
}
