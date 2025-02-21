public class Main {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto(), c2 = new Conjunto();

        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);

        c2.insertar(1);
        c2.insertar(2);
        c2.insertar(3);
        c2.insertar(4);

        System.out.println(Conjunto.incluido(c1, c2));
    }
}