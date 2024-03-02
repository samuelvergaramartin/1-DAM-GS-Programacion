/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class ActividadApp2P13 {
    public static void main(String[] args) {
        int comidaDiaria, numAnimales, kilosPorAnimal, comidaSobrante;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de comida que se compra: ");
        comidaDiaria = sc.nextInt();
        System.out.print("Numero de animales que hay: ");
        numAnimales = sc.nextInt();
        System.out.print("Cantidad de comida que come cada animal: ");
        kilosPorAnimal = sc.nextInt();
        
        if (comidaDiaria > 1 && numAnimales >  1 && kilosPorAnimal > 1) {
            if ( (comidaDiaria / numAnimales) >= kilosPorAnimal ) {
                comidaSobrante = (comidaDiaria / numAnimales - kilosPorAnimal) * numAnimales;
                System.out.println("La comida diaria es suficiente para alimentar a los animales y sobran " + comidaSobrante + " kilos");

            } else {
                int falta = Math.abs((comidaDiaria / numAnimales - kilosPorAnimal) * numAnimales);
                System.out.println("Para alimentar a todos los animales nos faltarian " + falta + " kilos de comida");
            }
        } else {
            System.out.println("Los valores tienen que ser mayores que 0");
        }
        sc.close();
        System.exit(0);
    }
}
