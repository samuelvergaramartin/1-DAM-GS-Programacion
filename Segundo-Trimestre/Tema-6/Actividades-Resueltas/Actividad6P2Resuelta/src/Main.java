import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase1, frase2, resultado = "La frase más corta es ";

        System.out.print("Introduce una frase: ");
        frase1 = sc.nextLine();

        System.out.print("Introduce otra frase: ");
        frase2 = sc.nextLine();

        if(frase1.length() < frase2.length()) resultado+= "la primera";
        else if(frase1.length() > frase2.length())resultado+= "la segunda";
        else resultado = "Las dos frases tienen el mismo tamaño";

        System.out.println(resultado);
    }
}