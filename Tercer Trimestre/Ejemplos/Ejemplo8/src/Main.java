import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        String algo = null, texto = "";
        String cadena = "1 2 3 4";

        sc = new Scanner(cadena);
        while(sc.hasNext()) {
            algo = sc.next();
            texto += algo;
        }

        System.out.println(texto);
    }
}