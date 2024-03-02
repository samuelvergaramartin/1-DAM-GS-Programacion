/**
 * @author Samuel Vergara Martín
 */
public class Actividad3P14 {
    public static void main(String[] args) {
        final String tabla = "Tabla del ";
        for(int x = 1; x <= 10; x++) {
            System.out.println(tabla + x);
            for(int y = 1; y <= 10; y++) {
                System.out.println(x + " X " + y + " = " + x*y);
            }
        }
    }
}