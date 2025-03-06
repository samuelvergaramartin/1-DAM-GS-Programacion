package superclases;

public class Terminal {
    protected final String numero;
    protected int tiempoLlamada;

    public Terminal(final String numero) {
        this.numero = numero;
    }

    public void llama(final Terminal t, final int tiempoLlamada) {
        if(t.equals(this)) System.out.println("Error: Una terminal no puede llamarse a si misma");
        else {
            if(tiempoLlamada > 0) {
                this.tiempoLlamada+= tiempoLlamada;
                t.tiempoLlamada+= tiempoLlamada;
            }
            else System.out.println("Error: El tiempo de llamada debe ser mayor que 0.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Terminal)) return false;

        if(numero.equals(((Terminal) obj).numero)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Nº " + numero + " - " + tiempoLlamada + "s de conversacion.";
    }
}
