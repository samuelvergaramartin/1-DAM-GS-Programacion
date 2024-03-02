package ejercicio7p9;
import java.util.Scanner;
import netcat_utils.*;
import Actions.BombillaActionHandler;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BombillaActionHandler bombillaAction = new BombillaActionHandler();
        boolean estadoInterruptorGeneral = false;
        final String red = Colors.RED;
        final String green = Colors.GREEN;
        final String cyan = Colors.CYAN;
        NetCatConsole nc = new NetCatConsole();
        String colores[] = { red, green, cyan };
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String firstOpt = null;
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla();
        Bombilla bombilla3 = new Bombilla();
        Bombilla bombilla4 = new Bombilla();
        Bombilla bombilla5 = new Bombilla();
        Bombilla bombilla6 = new Bombilla();
        Bombilla bombilla7 = new Bombilla();
        Bombilla bombilla8 = new Bombilla();
        Bombilla bombilla9 = new Bombilla();
        Bombilla bombilla10 = new Bombilla();
        
        Bombilla bombillas[] = {
            bombilla1,
            bombilla2,
            bombilla3,
            bombilla4,
            bombilla5,
            bombilla6,
            bombilla7,
            bombilla8,
            bombilla9,
            bombilla10
        };
        
        String menu[] = {
            cyan + "¿Que quieres hacer?",
            cyan + "1 - Encender una bombilla",
            cyan + "2 - Apagar una bombilla",
            cyan + "3 - Encender el interruptor general",
            cyan + "4 - Apagar el interruptor general",
            cyan + "5 - Salir del programa"
        };
        boolean controlFirstLoop = false;
        do {
            System.out.print("Estas en casa.\nQuieres luz?: ");
            firstOpt = sc.nextLine();

            switch(firstOpt) {
                case "Si": {
                    estadoInterruptorGeneral = true;
                    for(int i = 0; i < bombillas.length; i++) {
                            bombillas[i].updateEstadoGeneral(estadoInterruptorGeneral);
                    }
                    controlFirstLoop = true;
                }
                break;
                case "No": {
                    estadoInterruptorGeneral = false;
                    for(int i = 0; i < bombillas.length; i++) {
                            bombillas[i].updateEstadoGeneral(estadoInterruptorGeneral);
                    }
                    controlFirstLoop = true;
                }
                break;
                default: System.out.println(red + "ERROR: Opcion no valida");
            }
        } while(controlFirstLoop == false);
   
        
        do {
            nc.printSeparator();
            nc.printMultiple(menu);
            nc.printSeparator();
            System.out.print(cyan + "Seleccione una opcion: ");
            opt = sc.nextInt();
            switch(opt) {
                case 1: {
                    int nBombilla;
                    nc.printSeparator();
                    System.out.println("Cual bombilla quieres encender?");
                    nBombilla = sc.nextInt();
                    if(nBombilla < 1 || nBombilla > 10) System.out.println("Error: Esa bombilla no existe.");
                    else {
                        bombillaAction.powerOn(bombillas, colores, nBombilla);
                    }
                }
                break;
                case 2: {
                    int nBombilla;
                    nc.printSeparator();
                    System.out.println("Cual bombilla quieres apagar?");
                    nBombilla = sc.nextInt();
                    if(nBombilla < 1 || nBombilla > 10) System.out.println("Error: Esa bombilla no existe.");
                    else {
                        bombillaAction.powerOff(bombillas, colores, nBombilla);
                    }
                }
                break;
                case 3: {
                    if(estadoInterruptorGeneral == true) System.out.println(red + "ERROR: El interruptor general ya esta encendido.");
                    else {
                        estadoInterruptorGeneral = true;
                        for(int i = 0; i < bombillas.length; i++) {
                            bombillas[i].updateEstadoGeneral(estadoInterruptorGeneral);
                        }
                        System.out.println(green + "Interruptor general encendido correctamente.");
                        nc.printSeparator();
                        mostrarEstadosBombillas(bombillas, colores);
                    }
                }
                break;
                case 4: {
                    if(estadoInterruptorGeneral == false) System.out.println(red + "ERROR: El interruptor general ya esta apagado.");
                    else {
                        estadoInterruptorGeneral = false;
                        for(int i = 0; i < bombillas.length; i++) {
                            bombillas[i].updateEstadoGeneral(estadoInterruptorGeneral);
                        }
                        System.out.println(green + "Interruptor general apagado correctamente.");
                        nc.printSeparator();
                        mostrarEstadosBombillas(bombillas, colores);
                    }
                }
                break;
                case 5: System.out.println(cyan + "Finalizando programa...");
            }
        } while(opt != 5);
        
    }
    public static void mostrarEstadosBombillas(Bombilla[] bombillas, String[] colores) {
        final String red = colores[0];
        final String green = colores[1];
        final String cyan = colores[2];
        for(int i = 0; i < bombillas.length; i++) {
            boolean estadoBombilla = bombillas[i].estadoBombilla();
            if(estadoBombilla == true) System.out.println(cyan + "Bombilla " + (i+1) + green + ": Encendida");
            else System.out.println(cyan + "Bombilla " + (i+1) + red + ": Apagada.");
        }
    }
}
