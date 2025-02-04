import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String COMIENZO_DIALECTO = "Javalín, javalón    ",FINAL_DIALECTO = "javalén, len, len";
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();

        if(esDialecto(frase, COMIENZO_DIALECTO, FINAL_DIALECTO)) System.out.println("La frase está escrita en el idioma de Javalandia");
        else System.out.println("La frase no está escrita en el idioma de Javalandia.");

        frase = quitarDialecto(frase, COMIENZO_DIALECTO, FINAL_DIALECTO);

        System.out.println(frase);
    }

    private static String quitarDialecto(String frase, final String COMIENZO_DIALECTO, final String FINAL_DIALECTO) {
        if(frase.contains(COMIENZO_DIALECTO)) frase = frase.split(COMIENZO_DIALECTO)[1];
        if(frase.contains(FINAL_DIALECTO)) frase = frase.split(FINAL_DIALECTO)[0];
        return frase;
    }

    private static boolean esDialecto(String frase, final String COMIENZO_DIALECTO, final String FINAL_DIALECTO) {
        boolean resultado = false;

        if(frase.startsWith(COMIENZO_DIALECTO) || frase.endsWith(FINAL_DIALECTO)) resultado = true;

        return resultado;
    }
}