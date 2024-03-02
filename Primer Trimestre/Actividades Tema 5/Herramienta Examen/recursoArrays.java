/**
 * @author Samuel Vergara Martín
 */
public class recursoArrays {
    public static void main(String[] args) {
        int tabla[] = {12,43,56,11,9,87,34,55};
        int resultado[] = new int[tabla.length];
        resultado = ordenacionInsercion(tabla);
    }
    static int[] ordenacionInsercion(int[] t) {
        int j, aux;

        for(int i = 1; i < t.length; i++) {
            j = i;
            aux = t[i];
            while(j > 0 && aux < t[j - 1]) {
                t[j] = t[j - 1];
                j--;
            }
            t[j] = aux;
        }

        return t;
    }
    static int[] ordenacionBurbuja(int[] a) {
        boolean ordenado = false;
        int i = 0, aux;
        while(i < a.length -1 && !ordenado) {
            ordenado = true;
            for(int j = 0; j < a.length -i -1; j++) {
                if(a[j] > a[j+1]) {
                    ordenado = false;
                    aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }
        return a;
    }
}
