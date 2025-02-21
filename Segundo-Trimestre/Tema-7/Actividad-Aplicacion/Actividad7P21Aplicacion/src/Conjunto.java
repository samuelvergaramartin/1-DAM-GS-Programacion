import java.util.Arrays;
import java.util.Scanner;

public class Conjunto {
    private Lista conjunto;

    public Conjunto() {
        conjunto = new Lista();
    }

    public int numeroElementos() {
        return conjunto.obtenerNumeroElementos();
    }

    public boolean insertar(Integer nuevo) {
        boolean resultado = false;

        if (conjunto.obtenerIndicePrimeraOcurrencia(nuevo) != -1) System.out.println("Error: El elemento ya en el conjunto.");
        else {
            conjunto.insertarAlFinal(nuevo);
            resultado = true;
        }

        return resultado;
    }

    public boolean insertar(Conjunto otroConjunto) {
        boolean resultado = true;
        int indice = 0;
        final int elementosOtroConjunto[] = obtenerElementos(otroConjunto);

        //Terminar

        return false;
    }

    public boolean eliminarElemento(Integer elemento) {
        //Terminar
    }

    public boolean pertenece(Integer elemento) {
        final int elementos[] = obtenerElementos(this);
        int indice = 0;
        boolean resultado = false;

        while (indice < elementos.length && !resultado) {
            if(elementos[indice] == elemento) resultado = true;

            indice++;
        }
    }

    private int[] obtenerElementos(Conjunto conjunto) {
        String cadena = conjunto.toString();
        int elementos[] = new int[0];
        final Scanner sc;

        cadena = cadena.replace("[", "");
        cadena = cadena.replace("]", "");
        cadena = cadena.replace(",", "");

        sc = new Scanner(cadena);

        while (sc.hasNextInt()) {
            elementos = Arrays.copyOf(elementos, elementos.length + 1);
            elementos[elementos.length - 1] = sc.nextInt();
        }

        return elementos;
    }

    @Override
    public String toString() {
        return conjunto.toString();
    }
}
