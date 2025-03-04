public interface interfaz {
    default void metodo1() {
        System.out.println("Metodo 1");
    }

    default void metodo2() {
        System.out.println("Metodo 2");
        metodo6();
    }

    void metodo3();

    static void metodo4() {
        System.out.println("Metodo 4");
        interfaz.metodo5();
    }

    private static void metodo5() {
        System.out.println("Metodo 5");
    }

    private void metodo6() {
        System.out.println("Método 6");
    }
}
