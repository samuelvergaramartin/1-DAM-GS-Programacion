import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseInvertida;

        System.out.print("Introduzca una frase: ");

        fraseInvertida = invertirFrase(sc.nextLine().split(""));

        System.out.println(fraseInvertida);
    }

    public static String invertirFrase(String[] frase) {
        String resultado = "";

        for(int i = frase.length - 1; i >= 0; i--) {
            resultado+= frase[i];
        }

        return resultado;
    }
}