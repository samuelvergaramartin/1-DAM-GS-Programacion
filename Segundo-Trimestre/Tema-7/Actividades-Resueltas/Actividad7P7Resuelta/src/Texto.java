import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    private final int longitudMaxima;
    private String cadena = "";
    private int numVocales;
    private LocalDate fechaCreacion;

    public Texto(int longitudMaxima) {
        if(longitudMaxima > 0) this.longitudMaxima = longitudMaxima;
        else {
            System.out.println("Error: La longitud máxima debe ser mayor que 0");
            this.longitudMaxima = 1;
        }
    }

    public void agregarCaracterAlPrincipio(char caracter) {
        if(cadena.length() == longitudMaxima) {
            System.out.println("Error: Ya no queda más espacio en la cadena");
        }
        else {
            cadena = caracter + cadena;
            actualizarNumeroVocales();
        }
    }

    public void agregarCaracterAlFinal(char caracter) {
        if(cadena.length() == longitudMaxima) {
            System.out.println("Error: Ya no queda más espacio en la cadena");
        }
        else {
            cadena+= caracter;
            actualizarNumeroVocales();
        }
    }

    public void agregarCadenaAlPrincipio(String cadena) {
        if(this.cadena.length() + cadena.length() > longitudMaxima) {
            System.out.println("Error: No hay suficiente espacio en la cadena.");
        }
        else {
            this.cadena = cadena + this.cadena;
            actualizarNumeroVocales();
        }
    }

    public void agregarCadenaAlFinal(String cadena) {
        if(this.cadena.length() + cadena.length() > longitudMaxima) {
            System.out.println("Error: No hay suficiente espacio en la cadena.");
        }
        else {
            this.cadena+= cadena;
            actualizarNumeroVocales();
        }
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public String getCadena() {
        return cadena;
    }

    public int getNumVocales() {
        return numVocales;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    private boolean esVocal(Character vocal) {
        final Vocales vocales[] = Vocales.values();
        boolean resultado = false;

        for(Vocales e : vocales) {
            if(vocal.toString().equals(e.toString())) resultado = true;
        }

        return resultado;
    }

    private void actualizarNumeroVocales() {
        final char caracteres[] = (this.cadena.toUpperCase()).toCharArray();

        for(char c : caracteres) {
            if(esVocal(c)) this.numVocales++;
        }
    }
}
