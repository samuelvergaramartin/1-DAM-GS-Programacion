import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
        }
        while (frase.isBlank());

        frase = convertirACamelCase(frase);

        System.out.println(frase);
    }

    private static String convertirACamelCase(String frase) {
        String resultado = "", palabra;
        Scanner sc;
        frase = frase.toLowerCase();

        sc = new Scanner(frase);

        if(sc.hasNext()) {
            palabra = sc.next();
            for(int i = 0; i < palabra.length(); i++) {
                resultado+= palabra.charAt(i);
            }
        }

        while (sc.hasNext()) {
            palabra = sc.next();
            resultado+= String.valueOf(palabra.charAt(0)).toUpperCase();
            for(int i = 1; i < palabra.length(); i++) {
                resultado+= palabra.charAt(i);
            }
        }

        return resultado;
    }
}