package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);
        lista.encolar("A");
        lista.encolar("C");
        lista.encolar("B");
        System.out.println(lista);

        System.out.println("Ordenando...");
        lista.ordenar();
        System.out.println(lista);
    }
}