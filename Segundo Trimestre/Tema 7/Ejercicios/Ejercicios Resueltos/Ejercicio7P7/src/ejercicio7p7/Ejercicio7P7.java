package ejercicio7p7;
import java.util.Scanner;
import netcat_utils.Colors;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Texto texto = new Texto(20);
        String inputText;
        char inputCharacter;
        char characterArray[];
        
        do {
            System.out.print(Colors.CYAN + "Escriba una palabra (max 17 letras) : ");
            inputText = sc.nextLine();

            if(inputText.length() == 1)  {
                characterArray = inputText.toCharArray();
                inputCharacter = characterArray[0];

                texto.addCharacterToStart(inputCharacter);
                
                System.out.print(Colors.CYAN + "Escriba otra palabra (max " + (texto.longitudMaxima - (inputText).length()) +  " letras) : ");
                inputText = sc.nextLine();
                
                if(inputText.length() == 1) {
                    characterArray = inputText.toCharArray();
                    inputCharacter = characterArray[0];

                    texto.addCharacterToStart(inputCharacter);
                    
                    texto.mostrarInformacionTexto();
                }
                
                else {
                    texto.addStringToStart("Fin" + inputText);
                    texto.mostrarInformacionTexto();
                }
            }
            else {
                texto.addStringToStart("Fin" + inputText);
                texto.mostrarInformacionTexto();
                
                System.out.print(Colors.CYAN + "Escriba otra palabra (max " + (texto.longitudMaxima - ("Fin"+inputText).length()) +  " letras) : ");
                inputText = sc.nextLine();
                
                if(inputText.length() == 1) {
                    characterArray = inputText.toCharArray();
                    inputCharacter = characterArray[0];

                    texto.addCharacterToStart(inputCharacter);
                    
                    texto.mostrarInformacionTexto();
                }
                
                else {
                    texto.addStringToStart("Fin" + inputText);
                    texto.mostrarInformacionTexto();
                }
            }
        } while(texto.isValidInput() == false);
    }
    
}
