import java.util.*;

public class Temperaturas {
    private static final Map<String, Set<Integer>> TEMPERATURAS = new LinkedHashMap<>();

    public static boolean introducirTemperatura(String mes, Integer temperatura) {
        boolean introducida = true;

        if(TEMPERATURAS.containsKey(mes)) introducida = TEMPERATURAS.get(mes).add(temperatura);
        else {
            Set<Integer> temperaturasMes = new LinkedHashSet<>();
            temperaturasMes.add(temperatura);
            TEMPERATURAS.put(mes, temperaturasMes);
        }

        return introducida;
    }

    public static boolean eliminarMes(String mes) {
        return TEMPERATURAS.remove(mes) != null;
    }

    public static boolean eliminarTemperaturasMes(String mes) {
        boolean resultado = TEMPERATURAS.get(mes) != null && !TEMPERATURAS.get(mes).isEmpty();

        if(resultado) TEMPERATURAS.get(mes).clear();

        return resultado;
    }

    public static Set<String> meses() {
        return TEMPERATURAS.keySet();
    }

    public static Set<String> mesesTemperaturaMayor(Integer temperatura) {
        Set<String> meses = new LinkedHashSet<>();

        for(Map.Entry<String, Set<Integer>> entradas : TEMPERATURAS.entrySet()) {
            boolean encontrado = false;
            Iterator<Integer> it = entradas.getValue().iterator();

            while(it.hasNext() && !encontrado) {
                if(it.next() > temperatura) {
                    encontrado = true;
                    meses.add(entradas.getKey());
                }
            }
        }

        return meses;
    }
    public static String datosTemperaturas() {
        String datos = "{";

        for(Map.Entry<String, Set<Integer>> entradas : TEMPERATURAS.entrySet()) {
            datos += "\n\t" + entradas.getKey() + ": " + entradas.getValue().toString();
        }

        datos += "\n}";

        return datos;
    }

    public static String datosTemperaturasOrdenadas() {
        Set<Integer> temperaturasOrdenadas;
        String datos = "{";

        for(Map.Entry<String, Set<Integer>> entradas : TEMPERATURAS.entrySet()) {
            temperaturasOrdenadas = new TreeSet<>(entradas.getValue());
            datos += "\n\t" + entradas.getKey() + ": " + temperaturasOrdenadas;
        }

        datos += "\n}";

        return datos;
    }
}
