import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraOriginal, estadoPalabra;
        char letras[], letra;
        int intentos = 7;

        do {
            System.out.print("Jugador 1, introduce la palabra: ");
            palabraOriginal = sc.nextLine();
        }
        while (palabraOriginal.isBlank() || palabraOriginal.contains(" "));

        letras = new char[palabraOriginal.length()];
        Arrays.fill(letras, '-');

        estadoPalabra = String.copyValueOf(letras);

        do {
            //Revisar esto, porq da fallo al meter una letra bien
            System.out.println(estadoPalabra);
            System.out.print("Jugador 2, adivine una letra de la palabra: ");
            letra = sc.next().charAt(0);
            if(estaEnElArray(letras, letra)) {
                System.out.println("Correcto!");
                estadoPalabra = actualizarEstadoPalabra(palabraOriginal, letras, letra);
            }
            else {
                System.out.println("Ops...se equivocó");
                intentos--;
                System.out.println("Le quedan " + intentos + " intentos.");
            }
        }
        while (intentos > 0 && !estadoPalabra.equals(palabraOriginal));

        System.out.println("Fin de la partida.");
        if(intentos == 0) System.out.println("La palabra era: " + palabraOriginal);
        else System.out.println("Correcto! Has acertado la palabra! La palabra era " + palabraOriginal);
    }

    private static boolean estaEnElArray(char array[], char elemento) {
        boolean resultado = false;

        for(int i = 0; i < array.length && !resultado; i++) {
            if(array[i] == elemento) resultado = true;
        }
        return resultado;
    }

    private static String actualizarEstadoPalabra(String palabraOriginal, char letras[], char letra) {
        String resultado = "";

        for(int i = 0; i < letras.length; i++) {
            if(palabraOriginal.charAt(i) == letra) letras[i] = letra;

            resultado+= letras[i];
        }

        return resultado;
    }
}