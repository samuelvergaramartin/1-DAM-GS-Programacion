package EjerciciosResueltos.Ejercicio7P3.MainPackage;
import EjerciciosResueltos.Ejercicio7P3.netcat_utils.Colors;

public class CuentaCorriente {
    String dni;
    public String nombreTitular;
    private double saldo = 0;
    private String red = Colors.RED;
    private String cyan = Colors.CYAN;
    private String green = Colors.GREEN;
    private String resetColor = Colors.RESET;
    
    CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }
    
    void sacarDinero(double cantidad) {
        if(cantidad <= 0) System.out.println(red + "ERROR:" + resetColor + cyan + " La cantidad introducida debe ser mayor a 0." + resetColor);
        else if(cantidad > this.saldo) System.out.println(red + "ERROR:" + resetColor + cyan + " La cantidad que deseas sacar es mayor al saldo que tienes en tu cuenta." + resetColor);
        else {
            this.saldo -= cantidad;
            System.out.println(green + "Operacion realizada exitosamente." + resetColor + cyan + " Has sacado " + cantidad + "€ de tu cuenta." + resetColor);
        }
    }
    
    void ingresarDinero(double cantidad) {
        if(cantidad <= 0) System.out.println(red + "ERROR:" + resetColor + cyan + " La cantidad introducida debe ser mayor a 0." + resetColor);
        else {
            this.saldo += cantidad;
            System.out.println(green + "Operacion realizada exitosamente." + resetColor + cyan + " Has ingresado " + cantidad + "€ en tu cuenta." + resetColor);
        }
    }
    
    void mostrarInformacionCuenta() {
        System.out.println(cyan + "Titular de la cuenta: "  + this.nombreTitular + resetColor);
        System.out.println(cyan + "DNI del titular: " + this.dni + resetColor);
        System.out.println(cyan + "Saldo de la cuenta: " + this.saldo + resetColor);
    }
}
