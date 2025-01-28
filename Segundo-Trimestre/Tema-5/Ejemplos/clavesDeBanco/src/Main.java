import java.util.Scanner;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros1[][] = new int[3][3], numeros2[][] = new int[3][3], numero, password;
        char operaciones[][] = new char[3][3];

        rellenarMatriz(numeros1, 1, 100);
        rellenarMatriz(numeros2, 1000, 2000);
        rellenarMatriz(operaciones);

        pintarMatriz(numeros1);
        pintarMatriz(operaciones);
        pintarMatriz(numeros2);

        do {
            System.out.print("Introduzca un numero: ");
            numero = sc.nextInt();
        }
        while (numero == 0);

        password = generarClave(numeros1, operaciones, numeros2, numero);

        System.out.println("Su clave es: " + password);
    }

    private static int[] meterEnElArray(int array[], int valor) {
        array = copyOf(array, array.length + 1);
        array[array.length - 1] = valor;

        return array;
    }

    private static char[] meterEnElArray(char array[], char valor) {
        array = copyOf(array, array.length + 1);
        array[array.length - 1] = valor;

        return array;
    }

    private static int generarClave(int numeros1[][], char operaciones[][], int numeros2[][], int numero) {
        int numeros[] = new int[0];
        int resultado;
        char operador, operadores[] = new char[0];

        for(int i = 0; i < operaciones.length; i++) {
            for(int x = 0; x < operaciones[i].length; x++) {
                operador = operaciones[i][x];
                switch (operador) {
                    case '+': {
                        resultado = numeros1[i][x] + numeros2[i][x];
                        numeros = meterEnElArray(numeros, resultado);
                        operadores = meterEnElArray(operadores, operador);
                        break;
                    }
                    case '-': {
                        resultado = numeros1[i][x] - numeros2[i][x];
                        numeros = meterEnElArray(numeros, resultado);
                        operadores = meterEnElArray(operadores, operador);
                        break;
                    }
                    case '*': {
                        resultado = numeros1[i][x] * numeros2[i][x];
                        numeros = meterEnElArray(numeros, resultado);
                        operadores = meterEnElArray(operadores, operador);
                        break;
                    }
                    case '/': {
                        resultado = numeros1[i][x] / numeros2[i][x];
                        numeros = meterEnElArray(numeros, resultado);
                        operadores = meterEnElArray(operadores, operador);
                        break;
                    }
                }
            }
        }

        resultado = numeros[0];
        for(int i = 0; i < numeros.length - 1; i++) {
            switch (operadores[i]) {
                case '+': {
                    resultado+= numeros[i+1];
                    break;
                }
                case '-': {
                    resultado-= numeros[i+1];
                    break;
                }
                case '*': {
                    resultado*= numeros[i+1];
                    break;
                }
                case '/': {
                    resultado/= numeros[i+1];
                    break;
                }
            }
        }

        switch (operadores[operadores.length - 1]) {
            case '+': {
                resultado+= numero;
                break;
            }
            case '-': {
                resultado-= numero;
                break;
            }
            case '*': {
                resultado*= numero;
                break;
            }
            case '/': {
                resultado/= numero;
                break;
            }
        }

        return resultado;
    }

    private static void pintarMatriz(int matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for(int x = 0; x < matriz[i].length; x++) {
                System.out.print(matriz[i][x] + "\t");
            }
            System.out.println();
        }
    }

    private static void pintarMatriz(char matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for(int x = 0; x < matriz[i].length; x++) {
                System.out.print(matriz[i][x] + "\t");
            }
            System.out.println();
        }
    }

    private static void rellenarMatriz(int matriz[][], int min, int max) {
        for(int i = 0; i < matriz.length; i++) {
            for(int x = 0; x < matriz[i].length; x++) {
                matriz[i][x] = (int) ((Math.random() * (max - min + 1)) + min);
            }
        }
    }

    private static void rellenarMatriz(char matriz[][]) {
        int alea;
        for(int i = 0; i < matriz.length; i++) {
            for(int x = 0; x < matriz[i].length; x++) {
                alea = (int) ((Math.random() * (4)) + 1);
                switch (alea) {
                    case 1: {
                        matriz[i][x] = '+';
                        break;
                    }
                    case 2: {
                        matriz[i][x] = '-';
                        break;
                    }
                    case 3: {
                        matriz[i][x] = '*';
                        break;
                    }
                    case 4: {
                        matriz[i][x] = '/';
                        break;
                    }
                }
            }
        }
    }
}