public interface Interfaz {
    void saludo();

    default void saludoMultiple() {
        for (int i = 1; i <= 10; i++) {
            saludo();
        }
    }
}
