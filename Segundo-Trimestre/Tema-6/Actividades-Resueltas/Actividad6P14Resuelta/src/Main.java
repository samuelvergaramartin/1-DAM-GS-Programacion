import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, palabraDesordenada;

        do {
            System.out.print("Jugador 1, introduzca una palabra: ");
            palabra = sc.nextLine();
        }
        while (palabra.isBlank() || palabra.contains(" "));

        palabraDesordenada = desordenarPalabra(palabra);
        System.out.println(palabraDesordenada);

    }

    private static String desordenarPalabra(String palabra) {
        String resultado = "";
        boolean posiciones[] = new boolean[palabra.length()];
        int pos;

        while (resultado.length() < palabra.length()) {
            pos = (int) ((Math.random() * palabra.length()));

            if(!posiciones[pos]) {
                resultado+= palabra.charAt(pos);
                posiciones[pos] = true;
            }
        }

        return resultado;
    }
}