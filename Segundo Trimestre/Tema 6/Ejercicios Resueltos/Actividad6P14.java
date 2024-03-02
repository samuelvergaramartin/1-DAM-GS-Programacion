/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P14 {
    public static void main(String[] args) {
        String palabraIntroducida, palabraModificada, palabra;
        Scanner sc = new Scanner(System.in);
        char pIntroducida[];

        System.out.print("Jugador 1. Escribe una palabra: ");
        palabraIntroducida = sc.nextLine();

        pIntroducida = palabraIntroducida.toCharArray();

        palabraModificada = desordenar(pIntroducida);

        do {
            System.out.println(palabraModificada);
            System.out.println("Jugador 2. Introduce la palabra introducida por el jugador 1: ");
            palabra = sc.nextLine();
        } while(!palabra.equals(palabraIntroducida));
        sc.close();
        System.out.println("Correcto!");
    }
    static String desordenar(char[] pIntroducida) {
        for(int i = 0; i < pIntroducida.length; i++) {
            int i1 = (int) (Math.random() * pIntroducida.length);
            int i2 = (int) (Math.random() * pIntroducida.length);

            char aux = pIntroducida[i1];

            pIntroducida[i1] = pIntroducida[i2];
            pIntroducida[i2] = aux;
        }
        return String.valueOf(pIntroducida);
    }
}
