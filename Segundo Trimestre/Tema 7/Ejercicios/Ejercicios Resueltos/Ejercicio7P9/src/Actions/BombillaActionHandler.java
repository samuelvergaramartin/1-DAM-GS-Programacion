package Actions;
import netcat_utils.NetCatConsole;
import ejercicio7p9.Bombilla;
import static ejercicio7p9.Ejercicio7P9.mostrarEstadosBombillas;

/**
 *
 * @author Samuel Vergara Martín
 */
public class BombillaActionHandler {
    private NetCatConsole nc = new NetCatConsole();
    public BombillaActionHandler() {};
    
    public void powerOn(Bombilla[] bombillas, String[] colores, int nBombilla) {
        final String red = colores[0];
        final String green = colores[1];
        final String cyan = colores[2];
        boolean estadoBombilla = false;
        switch(nBombilla) {
            case 1: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 2: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 3: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 4: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 5: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 6: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 7: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 8: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 9: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 10: this.powerOnAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
        }
    }
    public void powerOff(Bombilla[] bombillas, String[] colores, int nBombilla) {
        final String red = colores[0];
        final String green = colores[1];
        final String cyan = colores[2];
        boolean estadoBombilla = false;
        switch(nBombilla) {
            case 1: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 2: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 3: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 4: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 5: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 6: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 7: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 8: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 9: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
            case 10: this.powerOffAction(estadoBombilla, bombillas, red, green, cyan, nBombilla, colores);
            break;
        }
    }
    private void powerOnAction(boolean estadoBombilla, Bombilla[] bombillas, String red, String green, String cyan, int nBombilla, String[] colores) {
        estadoBombilla = bombillas[nBombilla - 1].estadoBombilla();
        if(estadoBombilla == true) System.out.println(red + "ERROR: " + cyan + "La bombilla ya estaba encendida.");
        else {
            bombillas[nBombilla - 1].encenderBombilla();
            System.out.println(green + "Se ha encendido correctamente la bombilla.");
            nc.printSeparator();
            mostrarEstadosBombillas(bombillas, colores);
        }
    }
    private void powerOffAction(boolean estadoBombilla, Bombilla[] bombillas, String red, String green, String cyan, int nBombilla, String[] colores) {
        estadoBombilla = bombillas[nBombilla - 1].estadoBombilla();
        if(estadoBombilla != true) System.out.println(red + "ERROR: " + cyan + "La bombilla ya estaba apagada.");
        else {
            bombillas[nBombilla - 1].apagarBombilla();
            System.out.println(green + "Se ha apagado correctamente la bombilla.");
            nc.printSeparator();
            mostrarEstadosBombillas(bombillas, colores);
        }
    }
}
