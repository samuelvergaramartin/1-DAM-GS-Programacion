import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listaPositivos = new ArrayList<>();
        ArrayList<Double> listaNegativos = new ArrayList<>();
        Collection<Double> positivos = listaPositivos;
        Collection<Double> negativos = listaNegativos;
        Iterator<Double> it = null;
        double n, sumaPositivos = 0, sumaNegativos = 0;

        System.out.print("Introduce un numero: ");
        n = sc.nextDouble();

        while(n != 0) {
            if(n > 0) {
                positivos.add(n);
                sumaPositivos+= n;
            }
            else {
                negativos.add(n);
                sumaNegativos+= n;
            }

            System.out.print("Introduce un numero: ");
            n = sc.nextDouble();
        }

        System.out.println(positivos);
        System.out.println(negativos);
        System.out.println("Suma de positivos: " + sumaPositivos);
        System.out.println("Suma de negativos: " + sumaNegativos);

        positivos = eliminarDelRango(positivos, it);
        negativos = eliminarDelRango(negativos, it);

        System.out.println(positivos);
        System.out.println(negativos);
    }
    static Collection<Double> eliminarDelRango(Collection<Double> coleccion, Iterator<Double> it) {
        it = coleccion.iterator();
        double targeted;

        while(it.hasNext()) {
            targeted = it.next();
            if(targeted < -10 || targeted > 10) it.remove();
        }

        return coleccion;
    }
}