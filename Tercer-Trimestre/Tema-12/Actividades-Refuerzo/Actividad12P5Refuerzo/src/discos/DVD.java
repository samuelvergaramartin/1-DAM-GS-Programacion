package discos;

public class DVD extends Disco {
    private String descripcionDVD;

    public DVD(String nombre, String autor, String descripcionDVD) {
        super("DVD-", nombre, autor);
        setDescripcionDVD(descripcionDVD);
    }

    public void setDescripcionDVD(String descripcionDVD) {
        this.descripcionDVD = descripcionDVD;
    }

    @Override
    public String toString() {
        return super.toString() + "\r\tDescripcion del DVD: " + descripcionDVD + "\n}";
    }
}
