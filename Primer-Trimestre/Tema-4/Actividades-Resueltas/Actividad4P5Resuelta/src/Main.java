import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean esVocal = false;
        char caracter;
        String t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un carácter: ");

        //Aqui lo que hago es recopilar el caracter y ponerlo directamente a minúscula.
        caracter = ((sc.next().charAt(0) + "").toLowerCase()).charAt(0);

        System.out.print(caracter);
    }
}