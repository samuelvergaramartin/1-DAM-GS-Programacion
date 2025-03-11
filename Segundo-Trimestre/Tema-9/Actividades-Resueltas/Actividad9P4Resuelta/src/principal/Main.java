package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);
        lista.apilar(1);
        System.out.println(lista);
        lista.apilar(2);
        System.out.println(lista);
        System.out.println(lista.desapilar());
        System.out.println(lista);
        System.out.println("Cima de la pila: " + lista.cima());
    }
}