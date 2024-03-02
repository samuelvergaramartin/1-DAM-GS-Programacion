package ejercicio7p12;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Lista {
    private int[] array1;
    private int[] array2;
    
    Lista() {
        this.array1 = null;
        this.array2 = null;
    }
    
    static int[] concatena(int[] array1, int[] array2) {
        int resultado[] = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, resultado, 0, array1.length);
        int x = 0;
        for(int i = array1.length; i < resultado.length; i++) {
            resultado[i] = array2[x];
            x++;
        }
        
        return resultado;
    }
}
