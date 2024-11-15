import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean esVocal;
        char caracter;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un carácter: ");

        //Aqui lo que hago es recopilar el caracter y ponerlo directamente a minúscula.
        caracter = ((sc.next().charAt(0) + "").toLowerCase()).charAt(0);

        esVocal = vocal(caracter);

        if(esVocal) System.out.println("Es vocal");
        else System.out.println("No es vocal");
    }

    private static boolean vocal(char caracter) {
        boolean result;

        switch(caracter) {
            case 'a','e','i','o','u': {
                result = true;
                break;
            }
            default: {
                result = false;
                break;
            }
        }

        return result;
    }
}