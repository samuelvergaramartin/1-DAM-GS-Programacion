import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double comidaDiaria, kilosPorAnimal, resolve;
        int numAnimales;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la cantidad de comida diaria (KG): ");
        comidaDiaria = sc.nextDouble();

        System.out.print("Introduzca el número de animales: ");
        numAnimales = sc.nextInt();

        System.out.print("Introduzca la cantidad de kilos por animal: ");
        kilosPorAnimal = sc.nextDouble();

        if(comidaDiaria > 0) {
            if(numAnimales > 0) {
                if(kilosPorAnimal > 0) {
                    if(comidaDiaria / (kilosPorAnimal * numAnimales) >= 1) {
                        System.out.println("Tenemos alimentos suficientes.");
                    }
                    else {
                        System.out.println("No tenemos alimentos suficientes.");
                        resolve = comidaDiaria / numAnimales;
                        System.out.printf("Podriamos darle %.2f kilos de comida a cada animalito", resolve);
                    }
                }
                else System.out.println("Error: La cantidad minima de kilos por animal debe ser mayor que 1.");
            }
            else System.out.println("Error: Tiene que haber mínimo un animalito.");
        }
        else System.out.println("Error: La comida diaria tiene que ser mayor que 0.");
    }
}