package principal;

public class Main {
    public static void main(String[] args) {
        Lista cola = new Lista();

        System.out.println(cola);
        cola.apilar("Hola");
        System.out.println(cola);
        cola.apilar(true);
        System.out.println(cola);
        cola.apilar(45);
        System.out.println(cola);
        System.out.println(cola.desapilar());
        System.out.println(cola);
        System.out.println(cola.desapilar());
        System.out.println(cola);
        System.out.println(cola.desapilar());
        System.out.println(cola);
    }
}