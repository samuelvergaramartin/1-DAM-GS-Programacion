public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista(), lista2 = new Lista();

        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);

        lista2.insertarAlFinal(1);
        lista2.insertarAlFinal(2);

        System.out.println(lista);
        System.out.println(lista2);
        System.out.println(lista.equals(lista2));

        lista.insertarAlFinal(3);
        System.out.println(lista);
        System.out.println(lista.equals(lista2));

        lista.eliminarPorIndice(0);
        lista.eliminarPorIndice(0);
        lista.eliminarPorIndice(0);
        System.out.println(lista);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(1);
        System.out.println(lista);
        System.out.println(lista.equals(lista2));
    }
}