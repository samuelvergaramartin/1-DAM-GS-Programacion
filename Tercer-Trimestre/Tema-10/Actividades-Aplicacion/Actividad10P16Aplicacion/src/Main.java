import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    boolean registrada = registrarFirma();

                    if(registrada) System.out.println("Firma registrada correctamente.");
                    else System.out.println("Error: Firma ya estaba registrada.");

                    break;
                }
                case 2: {
                    System.out.println(obtenerFirmas());
                    break;
                }
                case 3: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opción inválida.");
                    break;
                }
            }
        }
        while (opcion != 3);
    }

    private static int menu() {
        final String MENU = """
                Menu de opciones:
                1- Introducir nueva firma.
                2- Mostrar todas las firmas.
                3- Salir.
                """;
        Scanner sc = new Scanner(System.in);

        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }

    private static boolean registrarFirma() {
        boolean registrada = false;
        String firma;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese la firma: ");
            firma = sc.nextLine();
        }
        while (firma.isBlank());

        if(!firmaRegistrada(firma)) {
            try(BufferedWriter out = new BufferedWriter(new FileWriter("Actividad10P16Aplicacion/firmas.txt", true))) {
                out.write(firma);
                out.newLine();
                registrada = true;
            }
            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return registrada;
    }

    private static boolean firmaRegistrada(String firma) {
        boolean encontrada = false;
        String linea;

        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P16Aplicacion/firmas.txt"))) {
            linea = in.readLine();

            while(linea != null && !encontrada) {
                if(linea.equals(firma)) encontrada = true;

                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return encontrada;
    }

    private static String obtenerFirmas() {
        String linea, firmas = "";

        try(BufferedReader in = new BufferedReader(new FileReader("Actividad10P16Aplicacion/firmas.txt"))) {
            linea = in.readLine();

            while(linea != null) {
                firmas += linea + "\n";
                linea = in.readLine();
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return firmas;
    }
}