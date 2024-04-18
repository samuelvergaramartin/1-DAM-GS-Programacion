import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        String algo = null, texto = "";
        String cadena = "hola adios otro";

        sc = new Scanner(cadena);
        while(sc.hasNext()) {
            algo = sc.next();
            texto += algo + " ";
        }

        System.out.println(texto);
    }
}