package superclases;

import java.util.Arrays;

public class Lista {
    protected Integer lista[];

    public Lista() {
        lista = new Integer[0];
    }

    public int obtenerNumeroElementos() {
        return lista.length;
    }

    public void insertarAlFinal(int numero) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = numero;
    }

    public void insertarAlPrincipio(int numero) {
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, 0, lista, 1, lista.length - 1);
        lista[0] = numero;
    }

    public void insertarPorIndice(int numero, int indice) {
        if(indice < 0 || indice > lista.length - 1) System.out.println("Error: El indice introducido no existe");
        else {
            lista = Arrays.copyOf(lista, lista.length + 1);
            System.arraycopy(lista, indice, lista, indice + 1, lista.length - indice - 1);
            lista[indice] = numero;
        }
    }

    public void eliminarPorIndice(int indice) {
        if(indice < 0 || indice > lista.length - 1) System.out.println("Error: El indice introducido no existe");
        else {
            System.arraycopy(lista, indice + 1, lista, indice, lista.length - indice - 1);
            lista = Arrays.copyOf(lista, lista.length - 1);
        }
    }

    public Integer obtenerNumeroPorIndice(int indice) {
        Integer resultado = null;

        if(indice < 0 || indice > lista.length - 1) System.out.println("Error: El indice introducido no existe");
        else {
            resultado = lista[indice];
        }

        return resultado;
    }

    public void insertarAlFinalOtraLista(Lista lista) {
        for (int i = 0; i < lista.obtenerNumeroElementos(); i++) {
            insertarAlFinal(lista.obtenerNumeroPorIndice(i));
        }
    }

    public int obtenerIndicePrimeraOcurrencia(int numero) {
        int resultado = -1, indice = 0;
        boolean encontrado = false;

        while (indice < lista.length && !encontrado) {
            if(lista[indice] == numero) {
                encontrado = true;
                resultado = indice;
            }

            indice++;
        }

        return resultado;
    }

    public void actualizarDireccionMemoria() {};

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Lista)) return false;

        return obj.toString().equals(toString());
    }

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }
}
