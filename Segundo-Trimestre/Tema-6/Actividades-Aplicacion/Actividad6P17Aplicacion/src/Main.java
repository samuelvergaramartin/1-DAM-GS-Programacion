import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.print("Escribe una palabra: ");
        palabra = sc.nextLine();

        mostrarEnGruposDe4(palabra);
    }

    private static void mostrarEnGruposDe4(String palabra) {
        String trozo = "";
        char cadena[] = palabra.toCharArray();
        int i = 0, contador;

        while (i < cadena.length) {
            contador = 4;
            while (i < cadena.length && contador > 0) {
                trozo += cadena[i];
                contador--;
                i++;
            }
            System.out.println(trozo);
            trozo = "";
        }
    }
}