public class Bombilla {
    private static boolean estadoInterruptorGeneral;
    private boolean estadoInterruptor;

    public boolean getEstadoInterruptor() {
        return estadoInterruptor;
    }

    public static boolean getEstadoInterruptorGeneral() {
        return estadoInterruptorGeneral;
    }

    public String estadoBombilla() {
        String estado;

        if(estadoInterruptorGeneral && estadoInterruptor) estado = "Encendida";
        else estado = "Apagada";

        return estado;
    }

    public void activarInterruptor() {
        estadoInterruptor = true;
    }

    public void desactivarInterruptor() {
        estadoInterruptor = false;
    }

    public static void activarInterruptorGeneral() {
        estadoInterruptorGeneral = true;
    }

    public static void desactivarInterruptorGeneral() {
        estadoInterruptorGeneral = false;
    }
}
