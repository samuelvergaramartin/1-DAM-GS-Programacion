package principal;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();

        System.out.println(cola);
        System.out.println(cola.estaVacia());
        cola.encolar(1);
        System.out.println(cola);
        cola.encolar(2);
        System.out.println(cola);
        System.out.println(cola.desencolar());
        System.out.println(cola);
        System.out.println(cola.estaVacia());
    }
}