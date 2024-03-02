/**
 * @author Samuel Vergara Martín
 */
public class Actividad5P1 {
    public static void main(String[] args) {
        int tabla[];
        int suma = 0;
        tabla = new int[10];

        for(int i = 0;i<tabla.length;i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
            suma+=tabla[i];
        }

        System.out.println(suma);
    }
}
