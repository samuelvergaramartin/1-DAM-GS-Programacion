import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Comparable<Registro>{
    private final LocalDateTime HORA;
    private final LocalDate FECHA;
    private double temperatura;

    public Registro(double temperatura, String fecha) {
        setTemperatura(temperatura);
        this.HORA = LocalDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.FECHA = LocalDate.parse(fecha, f);
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public double getTemperatura() {
        return temperatura;
    }

    public String getHORA() {
        return HORA.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getFECHA() {
        return FECHA.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getFechaYHora() {
        return getFECHA() + " " + getHORA();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tHora: " + getHORA() + "\n\tFecha: " + getFECHA() + "\n\tTemperatura: " + temperatura + "\n}";
    }

    @Override
    public int compareTo(Registro o) {
        int resultado;

        if(this.FECHA.equals(o.FECHA)) {
            resultado = this.HORA.compareTo(o.HORA);
        }
        else resultado = this.FECHA.compareTo(o.FECHA);

        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Registro)) return false;

        return ((Registro) obj).getFechaYHora().equals(this.getFechaYHora());
    }
}
