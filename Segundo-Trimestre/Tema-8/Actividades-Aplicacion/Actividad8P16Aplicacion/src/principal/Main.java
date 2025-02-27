package principal;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println(pila);
        pila.apilar(1);
        System.out.println(pila);
        pila.apilar(2);
        System.out.println(pila);
        System.out.println(pila.obtenerCima());
        System.out.println(pila.desapilar());
        System.out.println(pila);
    }
}