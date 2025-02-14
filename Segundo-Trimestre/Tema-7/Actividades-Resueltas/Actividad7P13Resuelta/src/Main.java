public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        System.out.println(pila);
        System.out.println(pila.obtenerCima());
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(5);
        System.out.println(pila);
        System.out.println(pila.obtenerNumeroElementos());
        System.out.println(pila.obtenerCima());

        pila.desapilar();
        System.out.println(pila.desapilar());

        System.out.println(pila);
    }
}