package dinero;

public class Billete {
    private final TiposBilletes tipo;

    public Billete(TiposBilletes tipo) {
        this.tipo = tipo;
    }

    public TiposBilletes getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\t" + tipo.toString() + "\n}";
    }
}
