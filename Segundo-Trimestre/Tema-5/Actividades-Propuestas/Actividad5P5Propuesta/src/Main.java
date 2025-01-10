import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,5,6,7};

        numeros = inserccionOrdenada(4, numeros);

        System.out.println(java.util.Arrays.toString(numeros));
    }

    private static int[] inserccionOrdenada(int nuevo, int t[]) {
        int indiceInsercion = binarySearch(t, nuevo), copia[] = new int[t.length + 1];

        if(indiceInsercion < 0) indiceInsercion = Math.abs(indiceInsercion) - 1;

        //Copiamos elementos hasta antes del hueco
        System.arraycopy(t, 0, copia, 0, indiceInsercion);

        //Copiamos desplazados los elementos tras el hueco
        System.arraycopy(t, indiceInsercion, copia, indiceInsercion + 1, (t.length - indiceInsercion));

        //asignamos el nuevo elemento
        copia[indiceInsercion] = nuevo;

        return copia;
    }
}