package interfaces;

public interface Cola {
    void encolar(String elemento);
    String desencolar();
    String cima();

    default void encolarMultiple(String elemento, int numVeces) {
        for(int i = 0; i < numVeces; i++) {
            encolar(elemento);
        }
    }
}