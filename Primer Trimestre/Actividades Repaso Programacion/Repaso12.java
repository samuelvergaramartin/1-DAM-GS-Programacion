import java.util.*;

/**
 * @author Samuel Vergara Martín 
 */
public class Repaso12 {

    public static void main(String[] args) {
        double notaPrimerExamen, notaCon40Porciento, notaSegundoExamen, notaCon60Porciento, mediaDeseada;
        final double porcentajePrimerExamen = 40 / 100, porcentajeSegundoExamen = 60 / 100;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca la nota que sacastes en el primer examen: ");
        notaPrimerExamen = sc.nextDouble();

        System.out.print("Introduzca la nota media deseada: ");
        mediaDeseada = sc.nextDouble();
        
        notaCon40Porciento = notaPrimerExamen * porcentajePrimerExamen;
        notaCon60Porciento = mediaDeseada - notaCon40Porciento;
        notaSegundoExamen = notaCon60Porciento / porcentajeSegundoExamen;

        System.out.println("Para sacar de media un " + mediaDeseada + " deberás sacar un " + notaSegundoExamen + " en el segundo examen");

        sc.close();

        System.exit(0);
        
    }
}
