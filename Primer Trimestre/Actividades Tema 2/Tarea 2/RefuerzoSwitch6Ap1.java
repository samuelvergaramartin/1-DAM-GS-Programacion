/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class RefuerzoSwitch6Ap1 {
    public static void main(String[] args) {
        String String, response;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una letra de la A a la Z: ");
        String = sc.nextLine();

        if(String.length() > 1) {
            System.out.println("ERROR: Debes introducir una sola letra de la A a la Z, no puedes introducir mas de una letra.");
            sc.close();
            System.exit(1);
        }
        
        response = switch(String) {
            case "a","A","e","E","i","I","o","O","u","U": {
                yield "Vocal";
            }
            case "b","B","c","C","d","D","f","F","g","G","h","H","j","J",
            "k","K","n","N","l","L","m","M","p","P","q","Q","r","R","s","S","t",
            "T","v","V","w","W","y","Y","z","Z": {
                yield "Consonante";
            }
            default: {
                yield "ERROR: El caracter introducido no es valido.";
            }
        };

        System.out.println(response);
        sc.close();
        System.exit(0);
    }
}
