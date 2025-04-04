import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();

        //Insertamos valores
        m.put("Ana", 1.62);
        m.put("Pedro", 1.75);
        m.put("Maria", 1.70);
        m.put("Julio", 1.85);
        m.put("Conchi", 1.50);

        System.out.println(m);

        //Cambiamos la altura de Ana
        m.put("Ana", 1.60);

        System.out.println(m);

        //Eliminamos la entrada con clave "Conchi"
        System.out.println("Valor de Conchi: " + m.remove("Conchi"));
        System.out.println("Valor de Juanma: " + m.remove("Juanma"));

        //Elimiamos todas las entradas
        //m.clear();
        //System.out.println(m);

        //Comprobamos si existe una clase determinada
        System.out.println("Clave Ana: " + m.containsKey("Ana"));
        System.out.println("Clave Jessica: " + m.containsKey("Jessica"));

        //Comprobamos sis existe un determinado valor
        System.out.println("Valor 1.60: " + m.containsValue(1.60));
        System.out.println("Valor 2.00: " + m.containsValue(2.00));

        //Obtenemos laa vistas de los mapas
        //Vistas: colección respaldada por un mapa (es decir, una colección que hace referencia a un mapa (posicion de memoria)

        //Vista con las claves
        Set<String> claves = m.keySet();
        System.out.println("\nClaves del mapa");
        System.out.println(claves);

        // Vista con los valores
        Collection<Double> estaturas = m.values();
        System.out.println("\nValores del mapa");
        System.out.println(estaturas);

        // Vista con las entradas del mapa
        Set<Map.Entry<String, Double>> entradas = m.entrySet();
        System.out.println("\nEntradas del mapa");
        System.out.println(entradas);

        // Recorro las entradas y muestro la información

        for(Map.Entry<String, Double> e : entradas) {
            System.out.println("Clave: " + e.getKey());
            System.out.println("Valor: " + e.getValue() + "\n");
        }

        //Le asigno a todos la misma altura

        /*for(Map.Entry<String, Double> e : entradas) {
            e.setValue(1.80);
        }

        System.out.println(m);*/

        Iterator<Map.Entry<String, Double>> it = entradas.iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> e = it.next();

            if(e.getValue() > 1.70) it.remove();
        }

        System.out.println(m);

        //No podemos añadir elementos con add en las vistas
        //Solo podemos añadir informacion a los mapas a trabes del metodo put de la interfaz Map

        m.put("Paco", 1.73);

        System.out.println(claves);
        System.out.println(entradas);
    }
}