import java.util.Scanner;

import static java.util.Arrays.deepToString;
public class Main {
    public static void main(String[] args) {
        int notasPrimerTrimestre[][] = new int[5][2], notasSegundoTrimestre[][] = new int[5][2],
        notasTercerTrimestre[][] = new int[5][2];
        double mediaGrupo[] = new double[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer trimestre: ");

        notasPrimerTrimestre = introducirNotas(notasPrimerTrimestre, sc);

        System.out.println("Segundo trimestre: ");

        notasSegundoTrimestre = introducirNotas(notasSegundoTrimestre, sc);

        System.out.println("Tercer trimestre: ");

        notasTercerTrimestre = introducirNotas(notasTercerTrimestre, sc);

        mediaGrupo = obtenerMediaGrupo(notasPrimerTrimestre, notasSegundoTrimestre, notasTercerTrimestre);
    }

    private static double[] obtenerMediaGrupo(int primerTrimestre[][], int segundoTrimestre[][], int tercerTrimestre[][]) {
        int suma1 = 0, suma2 = 0, suma3 = 0;
        double media[] = new double[3];

        for(int fila = 0; fila < primerTrimestre.length; fila++) {
            suma1+= primerTrimestre[fila][1];
            suma2+= segundoTrimestre[fila][1];
            suma3+= tercerTrimestre[fila][1];
        }

        media[0] = suma1/primerTrimestre.length;
        media[1] = suma2/segundoTrimestre.length;
        media[2] = suma3/tercerTrimestre.length;

        return media;
    }

    private static int[][] introducirNotas(int notas[][], Scanner sc) {
        for(int fila = 0; fila < notas.length; fila++) {
            notas[fila][0] = fila+1;
            System.out.print("Introduce la nota del alumno " + fila + ": ");
            notas[fila][1] = sc.nextInt();
        }

        return notas;
    }
}