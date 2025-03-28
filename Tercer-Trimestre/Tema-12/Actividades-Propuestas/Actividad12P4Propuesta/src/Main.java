import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> positivos = new ArrayList<>(), negativos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Iterator<Double> it;
        double num, sumaPositivos, sumaNegativos;

        sc.useLocale(Locale.US);

        System.out.print("Inserta un número: ");
        num = sc.nextDouble();

        while (num != 0) {
            if(num > 0) positivos.add(num);
            else negativos.add(num);

            System.out.print("Inserta otro número: ");
            num = sc.nextDouble();
        }

        sumaPositivos = sumarTodos(positivos);
        sumaNegativos = sumarTodos(negativos);

        System.out.println("Suma de los positivos: " + sumaPositivos);
        System.out.println("Positivos: ");
        System.out.println(positivos);
        System.out.println("Suma de los negativos: " + sumaNegativos);
        System.out.println("Negativos: ");
        System.out.println(negativos);

        eliminarTodosFueraDeRango(positivos);
        eliminarTodosFueraDeRango(negativos);

        System.out.println("Positivos: ");
        System.out.println(positivos);
        System.out.println("Negativos: ");
        System.out.println(negativos);
    }

    private static double sumarTodos(List<Double> lista) {
        double resultado = 0;
        Iterator<Double> it;

        if(!lista.isEmpty()) {
            it = lista.iterator();

            while (it.hasNext()) {
                resultado+= it.next();
            }
        }

        return resultado;
    }

    private static void eliminarTodosFueraDeRango(List<Double> lista) {
        Iterator<Double> it;

        if(!lista.isEmpty()) {
            it = lista.iterator();

            while (it.hasNext()) {
                Double elemento = it.next();
                if(elemento < -10 || elemento > 10) it.remove();
            }
        }
    }
}