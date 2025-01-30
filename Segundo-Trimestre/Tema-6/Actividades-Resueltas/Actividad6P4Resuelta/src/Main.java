import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEspacios;

        System.out.print("Introduce una frase: ");

        numEspacios = contarEspaciosEnBlanco(sc.nextLine());

        System.out.println("Su frase tiene " + numEspacios + " espacios en blanco");
    }

    private static int contarEspaciosEnBlanco(String frase) {
        int numEspacios = 0;

        for(String e : frase.split("")) {
            if(e.isBlank()) numEspacios++;
        }

        return numEspacios;
    }
}