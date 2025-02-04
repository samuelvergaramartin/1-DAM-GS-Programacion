import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra, frase = "";

        System.out.print("Introduce una palabra: ");
        palabra = sc.next();

        while (!palabra.equalsIgnoreCase("fin")) {
            frase+= palabra + " ";
            System.out.print("Introduce una palabra: ");
            palabra = sc.next();
        }

        System.out.println(frase);
    }
}