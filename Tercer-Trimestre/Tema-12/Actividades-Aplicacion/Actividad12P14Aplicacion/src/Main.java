public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        System.out.println(c);
        c.insertarAlFinal(1);
        System.out.println(c);
        c.insertarAlFinal(2);
        System.out.println(c);
        c.insertarAlFinal(3);
        System.out.println(c);
        System.out.println("Valor del indice 1: " + c.get(1));
    }
}