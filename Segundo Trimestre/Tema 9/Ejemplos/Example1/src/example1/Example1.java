package example1;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro();
        Triangulo triangulo = new Triangulo();
        Sonido s = new Perro();
        
        System.out.println(Perro.version);
        
        Sonido.bostezo();
    }
    
}
