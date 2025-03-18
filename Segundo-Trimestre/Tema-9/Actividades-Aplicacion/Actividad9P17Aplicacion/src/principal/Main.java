package principal;

public class Main {
    public static void main(String[] args) {
        Lista cola = new Lista();

        System.out.println(cola);
        cola.encolar("Hola");
        System.out.println(cola);
        cola.encolar(true);
        System.out.println(cola);
        cola.encolar(45);
        System.out.println(cola);
        System.out.println(cola.desencolar());
        System.out.println(cola);
        System.out.println(cola.desencolar());
        System.out.println(cola);
        System.out.println(cola.desencolar());
        System.out.println(cola);
    }
}