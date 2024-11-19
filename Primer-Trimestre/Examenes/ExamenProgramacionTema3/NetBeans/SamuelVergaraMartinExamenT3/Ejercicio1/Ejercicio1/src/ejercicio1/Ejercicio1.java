package ejercicio1;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;

        System.out.println("Generando la combinación de la lotería primitiva");

        for(int i = 1; i <= 6; i++) {
            num = (int) ((Math.random() * 49) + 1);
            System.out.print(num + " ");
        }
    }
    
}
