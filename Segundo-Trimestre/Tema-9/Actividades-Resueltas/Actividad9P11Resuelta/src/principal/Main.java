package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.apilar("A");
        System.out.println(lista);
        lista.apilar("B");
        System.out.println(lista);
        System.out.println(lista.desapilar());
        System.out.println(lista);
    }
}