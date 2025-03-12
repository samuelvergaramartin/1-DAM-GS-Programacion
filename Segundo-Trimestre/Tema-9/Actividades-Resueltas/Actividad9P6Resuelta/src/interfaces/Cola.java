package interfaces;

public interface Cola {
    void encolar(Integer elemento);
    Integer desencolar();
    Integer cima();

    default void encolarMultiple(Integer elemento, int numVeces) {
        for(int i = 0; i < numVeces; i++) {
            encolar(elemento);
        }
    }
}
