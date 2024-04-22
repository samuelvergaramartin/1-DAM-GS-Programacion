import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, output;

        System.out.print("Introduce una palabra: ");
        input = sc.nextLine();
        input = input.toLowerCase();

        output = descodificar(input);

        System.out.println(output);
    }
    static String descodificar(String input) {
        char conjunto1[] = {'e','i','k','m','p','q','r','s','t','u','v'},
        conjunto2[] = {'p','v','i','u','m','t','e','r','k','q','s'}, in[] = input.toCharArray();
        String result = "";

        for(int i = 0; i < in.length; i++) result+= descodifica(conjunto1,conjunto2,in[i]);

        return result;
    }
    static char descodifica(char conjunto1[], char conjunto2[], char c) {
        boolean codificado = false;
        int contador = 0;

        do if(conjunto2[contador] == c) codificado = true;
        else contador++;
        while(!codificado && contador < conjunto2.length);

        if(codificado == true) return conjunto1[contador];
        else return c;
    }
}