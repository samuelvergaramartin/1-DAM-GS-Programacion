package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);
        lista.encolar(1);
        System.out.println(lista);
        lista.encolar(2);
        System.out.println(lista);
        System.out.println(lista.desencolar());
        System.out.println(lista);
        System.out.println("Cima de la lista: " + lista.cima());
    }
}