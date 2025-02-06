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

        html = obtenerHTML(titulo, contenido);

        System.out.println(html);
    }

    private static String obtenerHTML(String titulo, String contenido) {
        String HTML = "<!DOCTYPE html>\n<html lang=\"es\">\n";

        HTML+= "\t<head>\n";
        HTML+= "\t\t<meta charset=\"UTF-8\">\n";
        HTML+= "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n";
        HTML+= "\t\t<title>" + titulo + "</title>\n";
        HTML+= "\t</head>\n";
        HTML+= "\t<body>\n";
        HTML+= "\t\t<p>" + contenido + "</p>\n";
        HTML+= "\t</body>\n";

        HTML+= "<html>\n";

        return HTML;
    }
}