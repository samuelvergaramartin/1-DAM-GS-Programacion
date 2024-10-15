import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int switchType = 2;
        char letra;
        String result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una letra: ");
        letra = sc.next().charAt(0);

        if(switchType == 1) {
            switch (letra) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                    result = "Vocal";
                    break;
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'y',
                     'z':
                    result = "Consonante";
                    break;
                case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'Y', 'Z':
                    result = "Consonante";
                    break;
                default:
                    result = "El símbolo introducido no es válido";
                    break;
            }
        }
        else {
            switch (letra) {
                case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' ->
                    result = "Vocal";
                case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'ñ', 'p', 'q', 'r', 's', 't', 'v', 'w', 'y',
                     'z'->
                    result = "Consonante";
                case 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'Ñ', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'Y', 'Z'->
                    result = "Consonante";
                default ->
                    result = "El símbolo introducido no es válido";
            }
        }

        System.out.println(result);
    }
}