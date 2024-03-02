/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P15 {
    public static void main(String[] args) {
        String palabraIntroducida, palabraModificada, palabra, pista;
        Scanner sc = new Scanner(System.in);
        char pIntroducida[];

        System.out.print("Jugador 1. Escribe una palabra: ");
        palabraIntroducida = sc.nextLine();

        pIntroducida = palabraIntroducida.toCharArray();

        palabraModificada = desordenar(pIntroducida);

        do {
            System.out.print("Adivina la palabra desorndenada: ");
            palabra = sc.nextLine();
            pista = mostrarAcertadas(palabra, palabraModificada);
            System.out.println(pista);
        } while(!palabra.equals(palabraModificada));
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
    static String mostrarAcertadas(String palabraIntroducida, String palabraModificada) {
        char pIntroducida[] = palabraIntroducida.toCharArray();
        char pModificada[] = palabraModificada.toCharArray();
        String resultado = "";

        for(int i = 0; i < pIntroducida.length; i++) {
            if(pIntroducida[i] == pModificada[i]) resultado+= pIntroducida[i];
            else resultado+= "*";
        }

        return resultado;
    }
}
