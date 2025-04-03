public class Main {
    public static void main(String[] args) {
        Pila<Integer> cola = new Pila<>();

        System.out.println(cola);
        cola.apilar(1);
        System.out.println(cola);
        cola.apilar(2);
        System.out.println(cola);
        cola.apilar(3);
        System.out.println(cola);
        System.out.println(cola.cima());
        System.out.println(cola.desapilar());
        System.out.println(cola);
    }
}