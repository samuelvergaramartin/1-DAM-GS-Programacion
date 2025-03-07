public class Ameba {
    private int peso;

    public Ameba() {
        peso = 3;
    }

    public void come(int cantidad) {
        if(cantidad > 0) {
            peso+= cantidad - 1;
        }
    }

    public void come(Ameba a) {
        peso += a.peso - 1;
        a.peso = 0;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + peso + " microgramos.";
    }
}
