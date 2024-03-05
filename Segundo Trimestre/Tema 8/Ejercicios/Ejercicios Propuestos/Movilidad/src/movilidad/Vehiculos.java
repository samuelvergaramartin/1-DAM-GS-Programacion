package movilidad;
import static netcat_utils.NetCatConsole.printMultiple;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Vehiculos {
    protected String marca;
    protected String modelo;
    protected enum tipo {Terrestre, Actuatico, Aereo};
    
    protected Vehiculos(String marca, String modelo, enum tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    protected mostrar() {
        String resultMostrar = {
            ""
        };
    }
}
