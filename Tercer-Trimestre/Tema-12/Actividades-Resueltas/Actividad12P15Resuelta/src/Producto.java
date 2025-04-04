public class Producto implements Comparable<Producto> {
    private static int numProducto;
    private final String CODIGO;
    private int stock;

    public Producto(String codigo, int stock) {
        this.CODIGO = codigo + "-" + (++numProducto);
        setStock(stock);
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock >= 0) this.stock = stock;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Producto)) return false;

        return ((Producto) obj).CODIGO.equals(CODIGO);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tCódigo: " + CODIGO + "\n\tStock: " + stock + "\n}";
    }

    @Override
    public int compareTo(Producto o) {
        return o.CODIGO.compareTo(CODIGO);
    }
}
