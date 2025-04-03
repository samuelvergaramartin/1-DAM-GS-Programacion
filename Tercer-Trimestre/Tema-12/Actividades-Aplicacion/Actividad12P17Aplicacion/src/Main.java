public class Main {
    public static void main(String[] args) {
        Cola<Integer> cola = new Cola<>();

        System.out.println(cola);
        cola.encolar(1);
        System.out.println(cola);
        cola.encolar(2);
        System.out.println(cola);
        cola.encolar(3);
        System.out.println(cola);
        System.out.println(cola.cima());
        System.out.println(cola.desencolar());
        System.out.println(cola);
    }
}