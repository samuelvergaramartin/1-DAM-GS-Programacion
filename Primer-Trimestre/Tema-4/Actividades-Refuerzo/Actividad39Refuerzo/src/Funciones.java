import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Funciones {
    public Funciones() {};

    public String convierteEnPalabras(int n) {
        String resultado = "";
        char[] numbers;
        List<Integer> buffer = new ArrayList<>();
        Iterator<Integer> it;
        int targeted;

        numbers = (n + "").toCharArray();

        for(char element : numbers) {
            buffer.add(Integer.parseInt(element + ""));
        }

        it = buffer.iterator();

        while (it.hasNext()) {
            targeted = it.next();
            resultado+= switch (targeted) {
                case 0 -> {
                    yield "cero";
                }
                case 1 -> {
                    yield "uno";
                }
                case 2 -> {
                    yield "dos";
                }
                case 3 -> {
                    yield "tres";
                }
                case 4 -> {
                    yield "cuatro";
                }
                case 5 -> {
                    yield "cinco";
                }
                case 6 -> {
                    yield "seis";
                }
                case 7 -> {
                    yield "siete";
                }
                case 8 -> {
                    yield "ocho";
                }
                case 9 -> {
                    yield "nueve";
                }
                default -> {
                    yield null;
                }
            };

            if(it.hasNext()) resultado+= ", ";
        }

        it = null;

        return resultado;
    }
}
