package aplicacionexamen;
import Coleccion.Flota;
import Embarcaciones.*;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class AplicacionExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Flota flota = new Flota();
        int numeroDelAcorazado = 1;
        int numeroDelSubmarino = 1;
        final String menu = """
                      1 - Insertar barco.
                      2 - Eliminar barco.
                      3 - Mostrar acorazados por orden de inserción.
                      """;
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        do {
            System.out.println(menu);
            System.out.print("Seleccione una opcion: ");
            opt = sc.nextInt();
            switch(opt) {
                case 1: {
                    String opt1c1;
                    int opt2c1;
                    boolean introducido = false;
                    System.out.print("Introduzca el tipo del barco (acorazado / submarino): ");
                    opt1c1 = sc.nextLine();
                    System.out.print("Introduzca la longitud del barco: ");
                    opt2c1 = sc.nextInt();
                    if(opt1c1 == "acorazado") {
                        int nCaniones;
                        System.out.print("Introduzca el numero de cañones: ");
                        nCaniones = sc.nextInt();
                        Acorazado acorazado = new Acorazado(numeroDelAcorazado, opt2c1);
                        acorazado.setCaniones(nCaniones);
                        introducido = flota.insertarBarco(acorazado);
                        if(introducido) {
                            numeroDelAcorazado++;
                            System.out.println("El barco ha sido introducido correctamente.");
                        }
                        else System.out.println("El barco no ha sido introducido debido a que ya existe uno igual.");
                    }
                    else {
                        Submarino submarino = new Submarino(numeroDelSubmarino, opt2c1);
                        introducido = flota.insertarBarco(submarino);
                        if(introducido) {
                            numeroDelSubmarino++;
                            System.out.println("El barco ha sido introducido correctamente.");
                        }
                    }
                }
                case 2: {
                    String opt1c2;
                    int opt2c2;
                    boolean eliminado = false;
                    System.out.print("Introduzca el tipo del barco (acorazado / submarino): ");
                    opt1c2 = sc.nextLine();
                    System.out.print("Introduzca la longitud del barco: ");
                    opt2c2 = sc.nextInt();
                    if(opt1c2 == "acorazado") {
                        Acorazado acorazado = new Acorazado(numeroDelAcorazado, opt2c2);
                        eliminado = flota.eliminarBarco(acorazado);
                        if(eliminado) {
                            numeroDelAcorazado--;
                            System.out.println("El barco ha sido eliminado correctamente.");
                        }
                        else System.out.println("El barco no ha sido eliminado debido a que no existe");
                    }
                    else {
                        Submarino submarino = new Submarino(numeroDelSubmarino, opt2c2);
                        eliminado = flota.eliminarBarco(submarino);
                        if(eliminado) {
                            numeroDelSubmarino--;
                            System.out.println("El barco ha sido eliminado correctamente.");
                        }
                    }
                }
                break;
            }
        }
        while(opt != 0);
        System.out.println("Fin del programa");
    }
    
}
