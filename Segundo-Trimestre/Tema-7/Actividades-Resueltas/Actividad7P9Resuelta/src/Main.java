public class Main {
    public static void main(String[] args) {
        Bombilla bombillas[] = {new Bombilla(), new Bombilla()};
        System.out.println(obtenerEstadosBombillas(bombillas));

        System.out.println("Encendiendo interruptor general...");
        Bombilla.activarInterruptorGeneral();
        System.out.println(obtenerEstadosBombillas(bombillas));
        System.out.println("Encendiendo bombilla 1...");
        bombillas[0].activarInterruptor();
        System.out.println(obtenerEstadosBombillas(bombillas));
        System.out.println("Apagando interruptor general...");
        Bombilla.desactivarInterruptorGeneral();
        System.out.println(obtenerEstadosBombillas(bombillas));
        System.out.println("Encendiendo interruptor general...");
        Bombilla.activarInterruptorGeneral();
        System.out.println(obtenerEstadosBombillas(bombillas));
        System.out.println("Apagando bombilla 1 y encendiendo bombilla 2...");
        bombillas[0].desactivarInterruptor();
        bombillas[1].activarInterruptor();
        System.out.println(obtenerEstadosBombillas(bombillas));
    }

    private static String obtenerEstadosBombillas(Bombilla bombillas[]) {
        String resultado = "";

        for (int i = 0; i < bombillas.length; i++) {
            resultado+= "Bombilla " + (i+1) + ": " + bombillas[i].estadoBombilla() + "\n";
        }

        return resultado;
    }
}