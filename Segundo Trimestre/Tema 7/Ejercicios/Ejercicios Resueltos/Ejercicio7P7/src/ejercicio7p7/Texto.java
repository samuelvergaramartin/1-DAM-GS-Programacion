package ejercicio7p7;
import java.time.LocalDateTime;
import netcat_utils.Colors;
import netcat_utils.NetCatConsole;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Texto {
    int longitudMaxima;
    private final String red = Colors.RED;
    private final String cyan = Colors.CYAN;
    private int totalVocales = 0;
    String texto = "";
    private LocalDateTime creacionTexto;
    private LocalDateTime modificacionTexto;
    private boolean valid;
    private NetCatConsole nc = new NetCatConsole();
    
    Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.creacionTexto = LocalDateTime.now();
    }
    
    void addCharacterToStart(char character) {
        String resolve = "" + character;
        if(this.texto == "") this.texto += character;
        else {
            char tempTextArray[];
            tempTextArray = this.texto.toCharArray();
            if(this.texto.length() + 1 > this.longitudMaxima) {
                System.out.println(red + "ERROR: No puedes agregar mas caracteres al texto porque el texto ya esta en su longitud maxima");
                this.valid = false;
            }
            else {
                this.valid = true;
                this.updateModificacionTexto();
                this.updateVocalCounter(resolve);
                this.texto = "";
                this.texto += character;
                for(int i = 0; i < tempTextArray.length; i++) {
                    this.texto += tempTextArray[i];
                }
            }
        }
    }
    
    void addCharacterToEnd(char character) {
        String resolve = "" + character;
        if(this.texto == "") this.texto += character;
        else {
            char tempTextArray[];
            tempTextArray = this.texto.toCharArray();
            if(this.texto.length() + 1 > this.longitudMaxima) {
                System.out.println(red + "ERROR: No puedes agregar mas caracteres al texto porque el texto ya esta en su longitud maxima");
                this.valid = false;
            }
            else {
                this.valid = true;
                this.updateModificacionTexto();
                this.updateVocalCounter(resolve);
                this.texto = "";
                for(int i = 0; i < tempTextArray.length; i++) {
                    this.texto += tempTextArray[i];
                }
                this.texto += character;
            }
        }
    }
    
    void addStringToStart(String cadena) {
        if(this.texto.length() >= this.longitudMaxima) {
            System.out.println(red + "ERROR: No puedes agregar mas letras al texto porque el texto ya esta en su longitud maxima");
            this.valid = false;
        }
        else {
            if(this.texto.length() + cadena.length() > this.longitudMaxima) System.out.println(red + "ERROR: La cadena introducida mas el texto ya almacenado superan el limite total establecido");
            else {
                this.valid = true;
                this.updateModificacionTexto();
                this.texto = cadena + this.texto;
                this.updateVocalCounter(cadena);
            }
        }
    }
    
    void addStringToEnd(String cadena) {
        if(this.texto.length() >= this.longitudMaxima) {
            System.out.println(red + "ERROR: No puedes agregar mas letras al texto porque el texto ya esta en su longitud maxima");
            this.valid = false;
        }
        else {
            if(this.texto.length() + cadena.length() > this.longitudMaxima) System.out.println(red + "ERROR: La cadena introducida mas el texto ya almacenado superan el limite total establecido");
            else {
                this.valid = true;
                this.updateModificacionTexto();
                this.texto += cadena;
                this.updateVocalCounter(cadena);
            }
        }
    }
    
    private void updateVocalCounter(String cadena) {
        char tempCadena[] = cadena.toCharArray();
        for(int i = 0; i < tempCadena.length; i ++) {
            switch(tempCadena[i]) {
                case 'a': totalVocales++;
                break;
                case 'A': totalVocales++;
                break;
                case 'e': totalVocales++;
                break;
                case 'E': totalVocales++;
                break;
                case 'i': totalVocales++;
                break;
                case 'I': totalVocales++;
                break;
                case 'o': totalVocales++;
                break;
                case 'O': totalVocales++;
                break;
                case 'u': totalVocales++;
                break;
                case 'U': totalVocales++;
                break;
            }
        }
    }
    
    boolean isValidInput() {
        return this.valid;
    } 
    
    private void updateModificacionTexto() {
        this.modificacionTexto = LocalDateTime.now();
    }
    
    void mostrarInformacionTexto() {
        String infoFinal[] = {
            cyan + "Fecha y Hora de la creacion del texto: " + this.creacionTexto,
            cyan + "Fecha y Hora de la modificacion del texto: " + this.modificacionTexto,
            cyan + "Texto actual: " + this.texto,
            cyan + "Longitud del texto: " + this.texto.length(),
            cyan + "Total de vocales en el texto: " + this.totalVocales
        };
        nc.printSeparator();
        nc.printMultiple(infoFinal);
    }
}
