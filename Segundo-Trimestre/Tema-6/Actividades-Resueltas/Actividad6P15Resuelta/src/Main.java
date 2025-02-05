import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, palabraDesordenada, palabraJugador2, pista;

        do {
            System.out.print("Jugador 1, introduzca una palabra: ");
            palabra = sc.nextLine();
        }
        while (palabra.isBlank() || palabra.contains(" "));

        palabraDesordenada = desordenarPalabra(palabra);

        System.out.println("Palabra desordenada: " + palabraDesordenada);
        System.out.print("Jugador 2, adivine la palabra: ");
        palabraJugador2 = sc.next();

        while (!palabraJugador2.equals(palabra)) {
            palabraDesordenada = desordenarPalabra(palabra);
            pista = obtenerPista(palabraJugador2, palabra);

            System.out.println("Palabra desordenada: " + palabraDesordenada);
            System.out.println("Pista: " + pista);
            System.out.print("Jugador 2, adivine la palabra: ");
            palabraJugador2 = sc.next();
        }
    }

    private static String obtenerPista(String palabraIntroducida, String palabraOriginal) {
        String pista = "";

        for(int i = 0; i < palabraOriginal.length() && i < palabraIntroducida.length(); i++) {
            if(palabraIntroducida.charAt(i) == palabraOriginal.charAt(i)) pista+= palabraIntroducida.charAt(i);
            else pista+= "-";
        }

        if(pista.length() < palabraOriginal.length()) {
            for(int i = pista.length(); i < palabraOriginal.length(); i++) {
                pista+= "-";
            }
        }

        return pista;
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