import java.util.Arrays;

public class Cola {
    private Integer tabla[];

    public Cola() {
        tabla = new Integer[0];
    }

    public void encolar(Integer elemento) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = elemento;
    }

    public Integer desencolar() {
        Integer elemento = null;

        if(tabla.length == 0) System.out.println("Error: Cola vacia.");
        else elemento = tabla[0];

        System.arraycopy(tabla, 1, tabla, 0, tabla.length - 1);
        tabla = Arrays.copyOf(tabla, tabla.length - 1);

        return elemento;
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }
}
