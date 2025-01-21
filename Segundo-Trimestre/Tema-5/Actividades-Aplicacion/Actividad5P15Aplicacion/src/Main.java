import java.util.Scanner;
import static java.util.Arrays.deepToString;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notasPrimerTrimestre[][], notasSegundoTrimestre[][], id,
        notasTercerTrimestre[][];
        double mediaGrupo, mediaAlumno;

        notasPrimerTrimestre = generarNotas();
        notasSegundoTrimestre = generarNotas();
        notasTercerTrimestre = generarNotas();

        mediaGrupo = obtenerMediaGrupo(notasPrimerTrimestre);

        System.out.println("Media del grupo en el primer trimestre: " + mediaGrupo);

        mediaGrupo = obtenerMediaGrupo(notasSegundoTrimestre);

        System.out.println("Media del grupo en el segundo trimestre: " + mediaGrupo);

        mediaGrupo = obtenerMediaGrupo(notasTercerTrimestre);

        System.out.println("Media del grupo en el tercer trimestre: " + mediaGrupo);

        do {
            System.out.print("Introduzca el identificador del alumno del cual desea ver su media: ");
            id = sc.nextInt();
        }
        while (id < 0 || id > 5);

        mediaAlumno = obtenerMediaAlumno(notasPrimerTrimestre, notasSegundoTrimestre, notasTercerTrimestre, id);

        System.out.println("La media del alumno de ID " + id + " es: " + mediaAlumno);
    }

    private static double obtenerMediaAlumno(int notas1[][], int notas2[][], int notas3[][], int id) {
        return ((notas1[id-1][1] + notas2[id-1][1] + notas3[id-1][1])/3.0);
    }

    private static int[][] generarNotas() {
        int notas[][] = new int[5][2];

        for(int i = 0; i < notas.length; i++) {
            notas[i][0] = i+1;
            notas[i][1] = (int) ((Math.random()) * 11);
        }

        return notas;
    }

    private static double obtenerMediaGrupo(int notas[][]) {
        int suma = 0;
        double media;

        for(int fila = 0; fila < notas.length; fila++) {
            suma+= notas[fila][1];
        }

        media = suma/notas.length;

        return media;
    }
}