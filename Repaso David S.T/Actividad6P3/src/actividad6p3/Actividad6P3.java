package actividad6p3;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Actividad6P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int version = 2;
        Scanner sc = new Scanner(System.in);
        String password, inputValue = null;
        
        System.out.print("Jugador 1: Introduzca la password: ");
        password = sc.nextLine();
        
        if(version == 1) v1(password, inputValue, sc);
        else v2(password, inputValue, sc);
    }
    static void v1(String password, String inputValue, Scanner sc) {
        final char passwd[] = password.toCharArray();
        char input[];
        boolean iguales;
        do {
            iguales = false;
            System.out.print("Jugador 2: Introduzca la password: ");
            inputValue = sc.nextLine();
            if(password.length() == inputValue.length()) {
                input = inputValue.toCharArray();
                iguales = true;
                for(int i = 0; i < passwd.length; i++) {
                    if(passwd[i] != input[i]) iguales = false;
                }
                if(!iguales) System.out.println("El valor introducido es igual que la password pero no es la password.");
            }
            if(inputValue.length() > password.length()) System.out.println("El valor introducido es mayor que la password");
            if(inputValue.length() < password.length()) System.out.println("El valor introducido es menor que la password");
        }
        while(!iguales);
        System.out.println("Correcto! Has acertado la password!");
    }
    static void v2(String password, String inputValue, Scanner sc) {
        final char passwd[] = password.toCharArray();
        char input[];
        boolean iguales;
        String output = "";
        
        do {
            iguales = false;
            System.out.print("Jugador 2: Introduzca la password: ");
            inputValue = sc.nextLine();
            input = inputValue.toCharArray();
            iguales = true;
            if(password.length() == inputValue.length()) {
                for(int i = 0; i < passwd.length; i++) {
                    if(passwd[i] != input[i]) {
                        iguales = false;
                        output += "*";
                    }
                    else output += input[i];
                }
            }
            else {
                for(int i = 0; i < passwd.length; i++) output += "*";
            }
            
            System.out.println("Password: " + output);
        }
        while(!iguales);
        System.out.println("Correcto! Has acertado la password!");
    }
}
