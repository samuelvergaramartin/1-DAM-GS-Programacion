package example1;

/**
 *
 * @author Samuel Vergara Martín
 */
public interface Sonido {
    //Metodos abstractos
    int version = 1;
    //Metodos abstractos
    void voz();
    
    //Metodos de extension (son los implementados)
    //Pueden ser
    // - Publicoo o privados
    // - Estaticos o no estaticos
    // Caso concreto motodo por defecto (son publicos y no estaticos)
    
    default void vozDuemiendo() {
        System.out.println("ZZZZZ");
    }
    
    //Metodo estatico
    static void bostezo() {
        System.out.println("Auugh");
    }
}
