package principal;

import superclases.Lista;

public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();
        //Lista lista = new Lista();

        System.out.println(conjunto);
        conjunto.insertarAlFinal(1);
        System.out.println(conjunto);
        conjunto.insertarAlFinal(1);
        conjunto.insertarAlPrincipio(1);
        conjunto.insertarAlFinal(2);
        System.out.println(conjunto);
        conjunto.insertarAlPrincipio(3);
        System.out.println(conjunto);

        //lista.insertarAlFinal(4);
        //lista.insertarAlFinal(5);
        //System.out.println(lista);
        //conjunto.insertarAlFinalOtraLista(lista);
        System.out.println(conjunto);
        //conjunto.insertarAlFinalOtraLista(lista);
    }
}