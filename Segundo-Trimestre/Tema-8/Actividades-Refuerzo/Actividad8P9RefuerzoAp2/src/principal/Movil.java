package principal;

import superclases.Terminal;

public class Movil extends Terminal {

    private String tarifa;
    private double cantidadTarificada;
    final int costeRata = 6, costeMono = 12, costeBisonte = 30;

    public Movil(final String numero, final String tarifa) {
        super(numero);
        setTarifa(tarifa);
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(final String tarifa) {
        switch (tarifa.toLowerCase()) {
            case "rata", "mono", "bisonte": {
                this.tarifa = tarifa;
                break;
            }
            default: {
                System.out.println("Error: La tarifa introducida no existe. Establecida en rata (tarifa por defecto)");
                this.tarifa = "rata";
                break;
            }
        }
    }

    @Override
    public void llama(Terminal t, int tiempoLlamada) {
        final int copiaTiempoLlamada = this.tiempoLlamada;
        super.llama(t, tiempoLlamada);

        if(this.tiempoLlamada != copiaTiempoLlamada) {
            switch (tarifa) {
                case "rata": {
                    cantidadTarificada+= (((tiempoLlamada/60)*costeRata)/100.0);
                    break;
                }
                case "mono": {
                    cantidadTarificada+= (((tiempoLlamada/60)*costeMono)/100.0);
                    break;
                }
                case "bisonte": {
                    cantidadTarificada+= (((tiempoLlamada/60)*costeBisonte)/100.0);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - tarificados " + cantidadTarificada + " euros";
    }
}
