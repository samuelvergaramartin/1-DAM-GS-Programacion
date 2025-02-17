package dinero;

public class Moneda {
    private final TiposMonedas tipo;

    public Moneda(TiposMonedas tipo) {
        this.tipo = tipo;
    }

    public TiposMonedas getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\t" + tipo.toString() + "\n}";
    }
}
