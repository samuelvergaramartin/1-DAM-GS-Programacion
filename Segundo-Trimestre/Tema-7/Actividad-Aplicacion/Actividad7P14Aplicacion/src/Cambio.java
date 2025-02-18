import dinero.Billete;
import dinero.Moneda;
import dinero.TiposBilletes;
import dinero.TiposMonedas;

import java.util.Arrays;

public class Cambio {
    private double precio, importe, cambio;
    private Object billetesYMonedas[];

    public Cambio(double precio, double importe) {
        if(importe < precio) System.out.println("Error: El importe debe ser igual o mayor al precio.");
        else {
            setPrecio(precio);
            setImporte(importe);
            cambio = importe - precio;
        }
    }

    public void setPrecio(double precio) {
        if(precio < 0) System.out.println("Error: El precio introducido debe ser mayor o igual que 0.");
        else this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setImporte(double importe) {
        if(importe < 0) System.out.println("Error: El importe introducido debe ser mayor o igual que 0.");
        else this.importe = importe;
    }

    public double getImporte() {
        return importe;
    }

    public double getCambio() {
        return cambio;
    }

    public Object[] obtenerDineroCambio() {
        double resto;
        billetesYMonedas = null;

        calcularCambio();

        if(cambio > 0) {
            billetesYMonedas = new Object[0];
            resto = cambio;

            while (resto >= 500) {
                agregarAlCambio(new Billete(TiposBilletes.QUINIENTOS_EUROS));
                resto-= 500;
            }
            while (resto >= 200) {
                agregarAlCambio(new Billete(TiposBilletes.DOSCIENTOS_EUROS));
                resto-= 200;
            }
            while (resto >= 100) {
                agregarAlCambio(new Billete(TiposBilletes.CIEN_EUROS));
                resto-= 100;
            }
            while (resto >= 50) {
                agregarAlCambio(new Billete(TiposBilletes.CINCUENTA_EUROS));
                resto-= 50;
            }
            while (resto >= 20) {
                agregarAlCambio(new Billete(TiposBilletes.VEINTE_EUROS));
                resto-= 20;
            }
            while (resto >= 10) {
                agregarAlCambio(new Billete(TiposBilletes.DIEZ_EUROS));
                resto-= 10;
            }
            while (resto >= 5) {
                agregarAlCambio(new Billete(TiposBilletes.CINCO_EUROS));
                resto-= 5;
            }
            while (resto >= 2) {
                agregarAlCambio(new Moneda(TiposMonedas.DOS_EUROS));
                resto-= 2;
            }
            while (resto >= 1) {
                agregarAlCambio(new Moneda(TiposMonedas.UN_EURO));
                resto-= 1;
            }
            while (resto >= 0.5) {
                agregarAlCambio(new Moneda(TiposMonedas.CINCUENTA_CENTIMOS));
                resto-= 0.5;
            }
            while (resto >= 0.2) {
                agregarAlCambio(new Moneda(TiposMonedas.VEINTE_CENTIMOS));
                resto-= 0.2;
            }
            while (resto >= 0.1) {
                agregarAlCambio(new Moneda(TiposMonedas.DIEZ_CENTIMOS));
                resto-= 0.1;
            }
            while (resto >= 0.05) {
                agregarAlCambio(new Moneda(TiposMonedas.CINCO_CENTIMOS));
                resto-= 0.05;
            }
            while (resto >= 0.02) {
                agregarAlCambio(new Moneda(TiposMonedas.DOS_CENTIMOS));
                resto-= 0.02;
            }
            while (resto >= 0.01) {
                agregarAlCambio(new Moneda(TiposMonedas.UN_CENTIMO));
                resto-= 0.01;
            }
        }

        return billetesYMonedas;
    }

    private void calcularCambio() {
        cambio = 0;

        if(importe < precio) System.out.println("Error al calcular el cambio. El importe es menor que el precio.");
        else cambio = importe - precio;
    }

    private void agregarAlCambio(Object dinero) {
        if(billetesYMonedas != null) {
            billetesYMonedas = Arrays.copyOf(billetesYMonedas, billetesYMonedas.length + 1);
            billetesYMonedas[billetesYMonedas.length - 1] = dinero;
        }
    }
}
