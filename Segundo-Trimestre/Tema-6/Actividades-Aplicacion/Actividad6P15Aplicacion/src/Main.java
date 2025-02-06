import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, contenido, html;

        do {
            System.out.print("Introduce un título: ");
            titulo = sc.nextLine();
        }
        while (titulo.isBlank());

        do {
            System.out.print("Introduce el contenido: ");
            contenido = sc.nextLine();
        }
        while (contenido.isBlank());


    }

    private static String obtenerHTML(String titulo, String contenido) {
        String HTML = "";

        return HTML;
    }
}