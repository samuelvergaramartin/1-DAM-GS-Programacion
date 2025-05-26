package discos;

public class CD extends Disco{
    private String descripcionCD;

    public CD(String nombre, String autor, String descripcionCD) {
        super("CD-", nombre, autor);
        setDescripcionCD(descripcionCD);
    }

    public void setDescripcionCD(String descripcionCD) {
        this.descripcionCD = descripcionCD;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\tDescripcion del CD: " + descripcionCD + "\n}";
    }
}
