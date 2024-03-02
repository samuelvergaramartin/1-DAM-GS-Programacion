package ejercicioanexoenumerados;

/**
 *
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
import java.util.Scanner;
public class EjercicioAnexoEnumerados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(Arrays.toString(billetes.values()));
        System.out.println(billetes.Cinco + ": Posicion " + billetes.Cinco.ordinal());
        System.out.println(billetes.Diez + ": Posicion " + billetes.Diez.ordinal());
        System.out.println(billetes.Veinte + ": Posicion " + billetes.Veinte.ordinal());
        System.out.println(billetes.Cincuenta + ": Posicion " + billetes.Cincuenta.ordinal());
        System.out.println(billetes.Cien + ": Posicion " + billetes.Cien.ordinal());
        System.out.println(billetes.Doscientos + ": Posicion " + billetes.Doscientos.ordinal());
        
        System.out.println("----------------------------------");
        
        System.out.print("Introduce una cadena: ");
        input = sc.nextLine();
        
        switch(input) {
            case "Cinco": siesta();
            break;
            case "Diez": siesta();
            break;
            case "Veinte": siesta();
            break;
            case "Cincuenta": siesta();
            break;
            case "Cien": siesta();
            break;
            case "Doscientos": siesta();
            break;
            default: System.out.println("No esta en el enum");
            break;
        }
        System.out.println("-------------------------------------");
        
        System.out.println("Introduce el billete: ");
        input = sc.nextLine();
        
        switch(input) {
            case "Cinco": System.out.println("Este es un billete de cinco euros");
            break;
            case "Diez": System.out.println("Este es un billete de diez euros");
            break;
            case "Veinte": System.out.println("Este es un billete de veinte euros");
            break;
            case "Cincuenta": System.out.println("Este es un billete de cincuenta euros");
            break;
            case "Cien": System.out.println("Este es un billete de cien euros");
            break;
            case "Doscientos": System.out.println("Este es un billete de doscientos euros");
            break;
            default: System.out.print("El billete introducido no existe.");
            break;
        }
    }
    static void siesta() {
        System.out.println("Esta en el enum");
    }
    
}
