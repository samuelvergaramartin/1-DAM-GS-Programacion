import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();

        m.put("Juan", 1.70);
        m.put("María", 1.65);
        m.put("Ricardo", 1.85);
        m.put("Julio", 1.74);

        System.out.println(m);

        m.put("Ricardo", 1.90);

        System.out.println("Actualizamos Ricardo: " + m);

        System.out.println("Eliminando Paco: " + m.remove("Paco"));
        System.out.println(m);

        m.clear();
        System.out.println(m);

        m.put("Juan", 1.74);
        m.put("María", 1.65);
        m.put("Ricardo", 1.85);
        m.put("Julio", 1.74);

        System.out.println("Altura de Juan: " + m.get("Juan"));
        System.out.println("Altura de Luis: " + m.get("Luis"));

        System.out.println("Clave Juan: " + m.containsKey("Juan"));
        System.out.println("Clave Rosa: " + m.containsKey("Rosa"));

        System.out.println("Valor 1.70: " + m.containsValue(1.70));
        System.out.println("Valor 1.95: " + m.containsValue(1.95));

        Set<String> claves = m.keySet();
        System.out.println("Claves del mapa: " + claves);
        Collection<Double> estaturas = m.values();
        System.out.println("Estaturas: " + estaturas);

        Set<Map.Entry<String, Double>> entradas = m.entrySet();
        System.out.println(entradas);

        System.out.println("Borrando a Juan...");
        claves.remove("Juan");
        System.out.println("Vista de claves"  + claves);
        System.out.println("Mapa: " + m);

        //Borramos a todas las entradas cuyo valor sea mayor que 1.70
        //Paso 1: Crear una vista con las entradas
        //Paso 2: Crear el iterador
        System.out.println("Borramos las entradas > 1.70");
        Iterator<Map.Entry<String, Double>> it;
        Map.Entry<String, Double> e;
        it = entradas.iterator();
        while(it.hasNext()) {
            e = it.next();
            if(e.getValue() > 1.70) it.remove();
        }

        System.out.println(m);1
    }
}