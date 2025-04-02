import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Comparable<Registro>{
    private final LocalDateTime HORA;
    private double temperatura;

    public Registro(double temperatura) {
        setTemperatura(temperatura);
        this.HORA = LocalDateTime.now();
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tHora: " + getHORA() + "\n\tTemperatura=" + temperatura + "\n}";
    }

    @Override
    public int compareTo(Registro o) {
        return (int) (temperatura - o.temperatura);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Registro)) return false;

        return ((Registro) obj).HORA.equals(HORA);
    }
}
