package ejercicio7p14aplicacion;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.NetCatConsole.printMultiple;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Cambio {
    private double billetesYMonedas[] = { 500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
    private int cantidadCadaBilleteYMonedas[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private String finalMessageBuilder[] = {
        "Billetes de 500€: ",
        "Billetes de 200€: ",
        "Billetes de 100€: ",
        "Billetes de 50€: ",
        "Billetes de 20€: ",
        "Billetes de 10€: ",
        "Billetes de 5€: ",
        "Monedas de 2€: ",
        "Monedas de 1€: ",
        "Monedas de 50 centimos: ",
        "Monedas de 20 centimos: ",
        "Monedas de 10 centimos: ",
        "Monedas de 5 centimos: ",
        "Monedas de 2 centimos: ",
        "Monedas de 1 centimo: "
    };
    private final double cantidadAPagar = 75.38;
    private double cantidadADevolver;
    
    Cambio() {};
    
    void mostrarCambio(double cantidadPagada) {
        this.cantidadADevolver = cantidadPagada - this.cantidadAPagar;
        this.cantidadADevolver = (double) (Math.round(this.cantidadADevolver * 100)) / 100;
        double cantidadDevuelta = 0;
        for(int i = 0; i < this.billetesYMonedas.length; i++) {
            if(this.billetesYMonedas[i] <= this.cantidadADevolver) {
                int x = 1;
                if(this.billetesYMonedas[i] == this.cantidadADevolver) {
                    this.cantidadCadaBilleteYMonedas[i] = x;
                    this.cantidadADevolver = 0;
                    cantidadDevuelta = this.cantidadADevolver;
                }
                else {
                    while((x * this.billetesYMonedas[i]) < this.cantidadADevolver) {
                        x++;
                        if((x * this.billetesYMonedas[i]) == this.cantidadADevolver) {
                            this.cantidadCadaBilleteYMonedas[i] = x;
                            this.cantidadADevolver = 0;
                            cantidadDevuelta = this.cantidadADevolver;
                        }
                        else {
                            if((x * this.billetesYMonedas[i]) > this.cantidadADevolver) {
                                this.cantidadCadaBilleteYMonedas[i] = (x-1);
                                cantidadDevuelta += ((x-1) * this.billetesYMonedas[i]);
                                this.cantidadADevolver -= ((x-1) * this.billetesYMonedas[i]);
                            }
                        }
                    }
                }
            }
        }
        String finalMessage[] = new String[this.billetesYMonedas.length];
        for(int i = 0; i < this.billetesYMonedas.length; i++) {
            finalMessage[i] = CYAN + this.finalMessageBuilder[i] + this.cantidadCadaBilleteYMonedas[i];
        }
        printMultiple(finalMessage);
    }
    
    
}
