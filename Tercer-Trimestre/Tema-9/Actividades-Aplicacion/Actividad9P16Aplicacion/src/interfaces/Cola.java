package interfaces;

public interface Cola {
    void encolar(Object elemento);
    Object desencolar();
    Object cima();

    default void encolarMultiple(Object elemento, int numVeces) {
        for(int i = 0; i < numVeces; i++) {
            encolar(elemento);
        }
    }
}
