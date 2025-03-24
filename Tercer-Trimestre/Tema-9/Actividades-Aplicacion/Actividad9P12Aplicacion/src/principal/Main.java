package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);
        lista.encolar("a");
        System.out.println(lista);
        lista.encolar("b");
        System.out.println(lista);
        System.out.println(lista.desencolar());
        System.out.println(lista);
    }
}