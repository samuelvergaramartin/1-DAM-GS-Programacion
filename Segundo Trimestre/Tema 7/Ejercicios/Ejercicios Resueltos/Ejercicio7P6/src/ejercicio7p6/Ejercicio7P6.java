package ejercicio7p6;
import java.util.Scanner;
import netcat_utils.Colors;
import netcat_utils.NetCatConsole;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora time = new Hora();
        NetCatConsole nc = new NetCatConsole();
        final String cyan = Colors.CYAN;
        final String red = Colors.RED;
        int inputHora, inputMinuto, inputSegundo, incrementoEnSegundos, newHora, newMinutos, newSegundos;
        boolean dataIsValid;
        
        System.out.print(cyan + "Introduce una hora: ");
        inputHora = sc.nextInt();
        
        System.out.print(cyan + "Introduce los minutos: ");
        inputMinuto = sc.nextInt();
        
        System.out.print(cyan + "Introduce los segundos: ");
        inputSegundo = sc.nextInt();
        
        time.setHoras(inputHora);
        time.setMinutos(inputMinuto);
        time.setSegundos(inputSegundo);
        
        dataIsValid = time.checkData();
        
        if(!dataIsValid) {
            String error[] = {
                red + "ERROR: La informacion introducida es invalida. Formato invalido.",
                cyan + "La hora debe tener un rango entre 0 y 24",
                cyan + "Los minutos deben tener un rango entre 0 y 60",
                cyan + "Los segundos deben tener un rango entre 0 y 60"
            };
            
            nc.printMultiple(error);
        }
        
        else {
            System.out.print(cyan + "Introduzca la cantidad a incrementar en segundos: ");
            incrementoEnSegundos = sc.nextInt();
            time.incrementarEnSegundos(incrementoEnSegundos);
            
            newHora = time.getHoras();
            newMinutos = time.getMinutos();
            newSegundos = time.getSegundos();
            
            nc.printSeparator();
            
            String resultado[] = {
                cyan + "Hora: " + newHora,
                cyan + "Minutos: " + newMinutos,
                cyan + "Segundos: " + newSegundos
            };
                    
            nc.printMultiple(resultado);
        }
    }
    
}
