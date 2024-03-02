/**
 * @author Samuel Vergara Martín
 * @see autocompletado de codigo NetBeans
 */
import java.util.*;
public class NetBeansConfig {
    public static void main(String[] args) {
        /**
         * Cada Abreviation sera el nombre de la función, y dentro de dicha función estará el codigo a autocompletar
         */
    }
    static void newscanner() {
        Scanner sc = new Scanner(System.in);
    }
    static void newscannerlocale() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
    }
    static void print() {
        System.out.print("${cursor}");
    }
    static void primo() {
        boolean caller = esPrimo(0);
    }
    static void capicua() {
        boolean caller = esCapicua(0);
    }
    static void voltearnumero() {
        int caller = voltea(0);
    }
    static void posiciondigito() {
        int caller = posicionDeDigito(0, 0);
    }
    static void piramide() {
        int altura;
        char c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();

        sc.nextLine();

        System.out.print("Introduce un caracter: ");
        c = sc.nextLine().charAt(0);

        for(int i = 1; i <= altura; i++) {  //Bucle que controla la fila
            
            for(int y = 1; y <=  altura - i; y++) {//Escribo los espacios antes del caracter
                System.out.print(" ");
            }
            for(int x = 1; x <= i; x++) {
                if(i > 2 && i < altura) {//Escribo caracter o hueco
                    if(x == 1 || x == i) {//Escribimos caracter en la primera y ultima posición
                        System.out.print(c + " ");
                    }
                    else {
                        System.out.print(" " + " ");//En medio escribo hueco + hueco
                    }
                }
                else {
                    System.out.print(c + " ");//En la ultima fila escribo todo caracteres
                }
            }
            System.out.println("");//Hago salto de linea
        }
        sc.close();
        System.exit(0);
    }

    /* ----------------------------------------------------------- */

    static boolean esPrimo(int num) {
        int cont = 2, resto;
        boolean primo = true;
        while ((cont < num) && primo) {
            resto = num % cont;
            if (resto == 0) {
                primo = false;
            }
            cont++;
        }
        
        if (primo) {
            return true;
        } else {
            return false;
        }
    }

    static boolean esCapicua(int num) {
        int numInvertido;
        boolean capicua = false;
        numInvertido = voltea(num);
        if(num == numInvertido) capicua = true;

        return capicua;
    }

    static int voltea(int num) {
        int resultado = 0;
        while(num > 0) {
            resultado = num % 10 + resultado*10;
            num = num / 10;
        }
        return resultado;
    }

    static int posicionDeDigito(int num, int digito) {
        int numTemp = num,contador = 1;
        boolean control = true;
        numTemp = voltea(numTemp);
        while(numTemp > 0 && control == true) {
            if(numTemp%10 == digito) {
                control = false;
            }
            else {
                numTemp = numTemp / 10;
                contador++;   
            }
        }
        return contador;
    }
}
