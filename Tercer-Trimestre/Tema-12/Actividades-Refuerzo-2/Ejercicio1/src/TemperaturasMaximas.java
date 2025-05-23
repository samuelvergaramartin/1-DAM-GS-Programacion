import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TemperaturasMaximas {
    private static Map<String, Integer> temperaturas = new LinkedHashMap<>();

    public static boolean introducirTemperatura(String mes, Integer temperatura) {
        boolean resultado = false;

        if((temperaturas.get(mes) != null && temperaturas.get(mes) < temperatura) || temperaturas.get(mes) == null) {
            temperaturas.put(mes, temperatura);
            resultado = true;
        }

        return resultado;
    }

    public static boolean eliminarMes(String mes) {
        return temperaturas.remove(mes) != null;
    }

    public static Set<String> meses() {
        return temperaturas.keySet();
    }

    public static Set<String> mesesTemperaturaMayor(Integer temperatura) {
        Set<String> meses = new LinkedHashSet<>();

        for(Map.Entry<String, Integer> entradas : temperaturas.entrySet()) {
            if(entradas.getValue() > temperatura) {
                meses.add(entradas.getKey());
            }
        }

        return meses;
    }

    public static String datosTemperaturas() {
        String datos = "{";

        for(Map.Entry<String, Integer> entradas : temperaturas.entrySet()) {
            datos += "\n\t" + entradas.getKey() + ": " + entradas.getValue();
        }

        datos += "\n}";

        return datos;
    }
}
