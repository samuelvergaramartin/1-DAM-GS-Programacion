import java.util.Scanner;
import static java.util.Arrays.sort;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        int puntuaciones[] = new int[5];
        Scanner sc = new Scanner(System.in);

        puntuacionProgramadores(puntuaciones, sc);
        puntuaciones = puntuacionesProgramadoresExhibicion(puntuaciones, sc);

        System.out.println(java.util.Arrays.toString(puntuaciones));
    }

    private static void puntuacionProgramadores(int puntuaciones[], Scanner sc) {
        for(int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Introduzca la puntuacion: ");
            puntuaciones[i] = sc.nextInt();
        }

        sort(puntuaciones);
    }

    private static int[] puntuacionesProgramadoresExhibicion(int puntuaciones[], Scanner sc) {
        int puntuacion;
        System.out.println("Programadores de exhibicion: ");
        do {
            System.out.print("Introduzca la nota: ");
            puntuacion = sc.nextInt();
            if(puntuacion != -1) puntuaciones = insercionOrdenada(puntuaciones, puntuacion);
        }
        while (puntuacion != -1);

        return puntuaciones;
    }

    private static int[] insercionOrdenada(int t[], int valor) {
        int indiceInsercion = binarySearch(t, valor),
        copia[] = new int [t.length + 1];

        if(indiceInsercion < 0) indiceInsercion = Math.abs(indiceInsercion) - 1;

        System.arraycopy(t, 0, copia, 0, indiceInsercion);
        System.arraycopy(t, indiceInsercion, copia, indiceInsercion + 1, (t.length - indiceInsercion));
        copia[indiceInsercion] = valor;

        return copia;
    }
}