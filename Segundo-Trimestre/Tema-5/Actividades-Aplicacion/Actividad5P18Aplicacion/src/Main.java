import java.util.Scanner;
import static java.util.Arrays.deepToString;

public class Main {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        for(int fila = 0; fila < matriz.length; fila++) {
            for(int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Fila: " + (fila+1));
                System.out.println("Columna: " + (columna+1));
                System.out.print("Introduzca un valor: ");
                matriz[fila][columna] = sc.nextInt();
            }
        }

        System.out.println("La matriz " + (esMagica(matriz) ? "es mágica" : "no es mágica"));
    }

    private static boolean esMagica(int matriz[][]) {
        int sumaFilas[] = new int[matriz.length], sumaColumnas[] = new int[matriz[0].length];
        boolean iguales = false;

        //Sumar las filas
        for(int fila = 0; fila < matriz.length; fila++) {
            for(int columna = 0; columna < matriz[fila].length; columna++) {
                sumaFilas[fila]+= matriz[fila][columna];
            }
        }

        //Sumar las columnas
        for(int columna = 0; columna < matriz.length; columna++) {
            for(int fila = 0; fila < matriz[columna].length; fila++) {
                sumaColumnas[columna]+= matriz[fila][columna];
            }
        }

        for(int fila = 0; fila < sumaFilas.length && !iguales; fila++) {
            for(int columna = 0; columna < sumaColumnas.length && !iguales; columna++) {
                if(sumaFilas[fila] == sumaColumnas[columna]) iguales = true;
            }
        }

        return iguales;
    }
}