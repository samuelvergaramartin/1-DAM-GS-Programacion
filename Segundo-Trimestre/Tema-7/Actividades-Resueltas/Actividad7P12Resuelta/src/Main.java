public class Main {
    public static void main(String[] args) {
        Lista resultado, lista1 = new Lista(), lista2 = new Lista();

        lista1.insertarAlFinal(1);
        lista1.insertarAlFinal(2);

        lista2.insertarAlFinal(3);
        lista2.insertarAlFinal(4);

        resultado = Lista.concatena(lista1, lista2);

        System.out.println(resultado);
    }
}