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

        if (pertenece(nuevo)) System.out.println("Error: El elemento ya en el conjunto.");
        else conjunto.insertarAlFinal(nuevo);

        return !pertenece(nuevo);
    }

    public boolean insertar(Conjunto otroConjunto) {
        final int elementosOtroConjunto[] = obtenerElementos(otroConjunto);
        boolean resultado = elementosOtroConjunto.length > 0;
        int indice = 0;

        while (indice < elementosOtroConjunto.length && resultado) {
            if(pertenece(elementosOtroConjunto[indice])) resultado = false;

            indice++;
        }

        if(resultado) {
            for(Integer e : elementosOtroConjunto) {
                conjunto.insertarAlFinal(e);
            }
        }

        return resultado;
    }

    public boolean eliminarElemento(Integer elemento) {
        final boolean resultado = pertenece(elemento);

        if(resultado) {
            conjunto.eliminarPorIndice(conjunto.obtenerIndicePrimeraOcurrencia(elemento));
        }

        return resultado;
    }

    public boolean eliminarConjunto(Conjunto otroConjunto) {
        final int elementos[] = obtenerElementos(otroConjunto);
        boolean resultado = elementos.length > 0;
        int indice = 0;

        while (indice < elementos.length && resultado) {
            resultado = pertenece(elementos[indice]);
            indice++;
        }

        if(resultado) {
            for(Integer e : elementos) {
                conjunto.eliminarPorIndice(conjunto.obtenerIndicePrimeraOcurrencia(e));
            }
        }

        return resultado;
    }

    public boolean pertenece(Integer elemento) {
        return conjunto.obtenerIndicePrimeraOcurrencia(elemento) != -1;
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

    public void muestra() {
        System.out.println(this);
    }

    public static boolean incluido(Conjunto c1, Conjunto c2) {
        int elementosC1[] = c1.obtenerElementos(c1);
        int contador = elementosC1.length, indice = 0;
        boolean resultado = contador == 0;

        while (indice < elementosC1.length && !resultado) {
            if(c2.pertenece(elementosC1[indice])) contador--;

            resultado = contador == 0;
            indice++;
        }

        return resultado;
    }

    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto conjunto = new Conjunto();

        conjunto.insertar(c1);
        conjunto.insertar(c2);

        return conjunto;
    }

    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto conjunto = new Conjunto();



        return conjunto;
    }

    @Override
    public String toString() {
        return conjunto.toString();
    }
}
