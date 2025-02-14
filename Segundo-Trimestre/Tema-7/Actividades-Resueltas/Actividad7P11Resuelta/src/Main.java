public class Main {
    public static void main(String[] args) {
        Lista lista1 = new Lista(), lista2 = new Lista();

        lista1.insertarAlFinal(1);
        lista1.insertarAlFinal(2);
        lista1.insertarAlFinal(3);

        System.out.println(lista1);

        lista1.insertarPorIndice(4, 1);
        System.out.println(lista1);

        lista1.eliminarPorIndice(1);
        lista1.mostrarElementos();

        lista1.insertarAlPrincipio(100);
        lista1.mostrarElementos();

        lista2.insertarAlFinal(4);
        lista2.insertarAlFinal(5);
        lista2.insertarAlFinal(6);

        lista1.insertarAlFinalOtraLista(lista2);
        lista1.mostrarElementos();

        System.out.println(lista1.obtenerIndicePrimeraOcurrencia(99));
        lista1.insertarAlFinal(100);
        lista1.mostrarElementos();
        System.out.println(lista1.obtenerIndicePrimeraOcurrencia(100));
    }
}