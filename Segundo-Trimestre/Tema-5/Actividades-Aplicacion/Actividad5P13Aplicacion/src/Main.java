import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5], resultado[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        resultado = copiaDesordenada(numeros);

        System.out.println(java.util.Arrays.toString(numeros));
        System.out.println(java.util.Arrays.toString(resultado));
    }

    private static int[] copiaDesordenada(int tabla[]) {
        int copia[] = new int[tabla.length],aux[] = new int[tabla.length], contador = 0, posicion;
        boolean pos[] = new boolean[aux.length];

        for(int i = 0; i < tabla.length; i++) {
            aux[i] = tabla[i];
        }

        posicion = (int) (Math.random() * aux.length);

        copia[posicion] = aux[0];
        pos[posicion] = true;
        contador++;

        while (contador < aux.length) {
            posicion = (int) (Math.random() * aux.length);

            if(!pos[posicion]) {
                copia[posicion] = aux[contador];
                pos[posicion] = true;
                contador++;
            }
        }

        aux = null;
        pos = null;

        return copia;
    }
}