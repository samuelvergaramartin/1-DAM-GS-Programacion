package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del árbol: ");
        altura = sc.nextInt();

        estrellita(altura);
        arbolito(altura);
        tronco(altura);
    }
    private static void estrellita(int altura) {
        parteSuperiorEstrellita(altura);
        parteInferiorEstrellita(altura);

    }

    private static void parteSuperiorEstrellita(int altura) {
        int posInicialRelleno, nEspacios, rellenosAAnadir;
        for(int i = 1; i <= altura; i++) {
            posInicialRelleno = ((altura - i) + 1);
            nEspacios = altura - i;
            //Espacios
            for(int x = 1; x <= nEspacios + 4; x++) {
                System.out.print(" ");
            }
            //Relleno (*) - Parte izquierda
            for (int x = posInicialRelleno; x <= altura; x++) {
                System.out.print("*");
            }
            //Relleno (*) - Parte derecha
            rellenosAAnadir = (altura) - (posInicialRelleno);
            for(int x = altura + 1; x <= (altura + rellenosAAnadir); x++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void parteInferiorEstrellita(int altura) {
        //Es una piramide invertida menos la base, para formar la estrella
        int posInicialRelleno, nEspacios, rellenosAAnadir;
        for(int i = altura - 1; i > 0; i--) {
            posInicialRelleno = ((altura - i) + 1);
            nEspacios = altura - i;
            //Espacios
            for(int x = 1; x <= nEspacios + 4; x++) {
                System.out.print(" ");
            }
            //Relleno (*) - Parte izquierda
            for (int x = posInicialRelleno; x <= altura; x++) {
                System.out.print("*");
            }
            //Relleno (*) - Parte derecha
            rellenosAAnadir = (altura) - (posInicialRelleno);
            for(int x = altura + 1; x <= (altura + rellenosAAnadir); x++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void arbolito(int altura) {
        //Aplico la relación
        altura+= 4;
        int posInicialRelleno, nEspacios, rellenosAAnadir;
        for(int i = 1; i <= altura; i++) {
            posInicialRelleno = ((altura - i) + 1);
            nEspacios = altura - i;
            //Espacios
            for(int x = 1; x <= nEspacios; x++) {
                System.out.print(" ");
            }
            //Relleno (*) - Parte izquierda
            for (int x = posInicialRelleno; x <= altura; x++) {
                System.out.print("*");
            }
            //Relleno (*) - Parte derecha
            rellenosAAnadir = (altura) - (posInicialRelleno);
            for(int x = altura + 1; x <= (altura + rellenosAAnadir); x++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void tronco(int altura) {
        altura+=4;
        for(int i = 1; i <=4; i++) {
            //Dibujo espacios a la izquierda
            for(int x = 1; x <= altura - 2; x++) {
                System.out.print(" ");
            }
            //Dibujo el tronco
            for(int x = altura -1; x <= altura + 1; x++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
