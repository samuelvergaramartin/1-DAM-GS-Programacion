import java.util.Arrays;

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
        String cadena;
        String elementos[];

        if (otroConjunto.numeroElementos() > 0) {
            cadena = otroConjunto.toString();
            elementos = cadena.split("");
            if(otroConjunto.numeroElementos() > 1) {
                System.arraycopy(elementos, 1, elementos, 0, elementos.length - 2);
                elementos = Arrays.copyOf(elementos, elementos.length - 2);
            }
            else {
                System.out.println("A");
                /*elementos[0] = elementos[0].replace("[", "");
                elementos[0] = elementos[0].replace("]", "");*/
                System.out.println(elementos[0]);
            }


            /*while (indice < otroConjunto.numeroElementos() && resultado) {

            }*/
        }
        else resultado = false;

        return false;
    }

    @Override
    public String toString() {
        return conjunto.toString();
    }
}
