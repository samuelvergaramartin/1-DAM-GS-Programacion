import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tarea 1
        for (Billetes billete : Billetes.values()) {
            System.out.println(billete.ordinal() + " - " + billete);
        }

        //Tarea 2
        Scanner sc = new Scanner(System.in);
        boolean billeteValido;
        String nombreDelBillete;

        System.out.print("Introduce el nombre del billete: ");
        nombreDelBillete = sc.nextLine();

        billeteValido = (Arrays.toString(Billetes.values())).contains(nombreDelBillete.toUpperCase());

        if(billeteValido) {
            System.out.println("Es un billete válido");
        }
        else System.out.println("No es un billete válido.");

        //Tarea 3
        Billetes billete;

        if (billeteValido) billete = Billetes.valueOf(nombreDelBillete.toUpperCase());
        else billete = Billetes.CIEN;

        switch (billete) {
            case CINCO -> {
                System.out.println("Es billete de color azul claro.");
            }
            case DIEZ -> {
                System.out.println("Es un billete de color rosa.");
            }
            case VEINTE -> {
                System.out.println("Es un billete de color azul oscuro.");
            }
            case CINCUENTA -> {
                System.out.println("Es un bilete de color naranja.");
            }
            case CIEN -> {
                System.out.println("Es un billete de color verde.");
            }
            case DOSCIENTOS -> {
                System.out.println("Es un billete de color amarillo.");
            }
            default -> {
                System.out.println("Billete no válido.");
            }
        }
    }
}