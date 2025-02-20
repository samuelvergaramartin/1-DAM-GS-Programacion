import java.util.Arrays;

public class Pila {
    private Integer[] tabla;

    public Pila() {
        tabla = new Integer[0];
    }

    public void apilar(int elemento) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);

        if (tabla.length > 1) {
            System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        }

        tabla[0] = elemento;
    }

    public Integer desapilar() {
        Integer elemento = null;

        if(tabla.length == 0) System.out.println("Error: La pila está vacía.");
        else {
            elemento = tabla[0];
            System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }

        return elemento;
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }
}
