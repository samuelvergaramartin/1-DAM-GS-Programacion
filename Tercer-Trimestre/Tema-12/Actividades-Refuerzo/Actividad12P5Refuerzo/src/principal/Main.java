package principal;

import almacen.Almacen;
import discos.CD;
import discos.DVD;
import discos.Disco;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Almacen almacen = new Almacen();

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    boolean guardado = guardarDisco(almacen);

                    if (guardado) System.out.println("Se ha guardado el disco en el almacen.");
                    else System.out.println("Error: El disco ya estaba guardado en el almacen.");

                    break;
                }
                case 2: {
                    boolean modificado = modificarDisco(almacen);

                    if (modificado) System.out.println("Se ha modificado el disco satisfactoriamente.");
                    else System.out.println("Error: No existe el disco en el almacen.");

                    break;
                }
                case 3: {
                    boolean sacado = sacarDisco(almacen);

                    if (sacado) System.out.println("Se ha sacado el disco del almacen.");
                    else System.out.println("Error: No existe el disco en el almacen.");

                    break;
                }
                case 4: {
                    System.out.println(almacen);
                    break;
                }
                case 5: {
                    System.out.println(Arrays.toString(almacen.obtenerDiscosOrdenadosPorNombre()));
                    break;
                }
                case 6: {
                    System.out.println(Arrays.toString(almacen.obtenerDiscosOrdenadosPorAutor()));
                    break;
                }
                case 7: {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default: {
                    System.out.println("Error: Opcion no valida.");
                    break;
                }
            }
        }
        while (opcion != 7);
    }

    private static int menu() {
        final String MENU = """
                Menu de opciones del almacen:
                1- Guardar disco
                2- Modificar disco
                3- Sacar disco
                4- Mostrar discos ordenados por orden de insercción
                5- Mostrar discos ordenados por nombre.
                6- Mostrar discos ordenados por autor.
                7- Salir
                """;
        Scanner sc = new Scanner(System.in);
        System.out.println(MENU);
        System.out.print("Introduzca una opción: ");

        return sc.nextInt();
    }

    private static boolean guardarDisco(Almacen almacen) {
        Scanner sc = new Scanner(System.in);
        String nombre, autor, tipo;
        boolean guardado;

        do {
            System.out.print("Introduzca el nombre del disco: ");
            nombre = sc.nextLine();
        }
        while (nombre.isBlank());

        do {
            System.out.print("Introduzca el autor del disco: ");
            autor = sc.nextLine();
        }
        while (autor.isBlank());

        do {
            System.out.print("Introduzca el tipo del disco (CD o DVD): ");
            tipo = sc.nextLine();
        }
        while (!tipo.equalsIgnoreCase("CD") && !tipo.equalsIgnoreCase("DVD"));

        if(tipo.equalsIgnoreCase("CD")) guardado = almacen.guardar(new CD(nombre, autor, "Esto es un CD"));
        else guardado = almacen.guardar(new DVD(nombre, autor, "Esto es un DVD"));

        return guardado;
    }

    private static boolean modificarDisco(Almacen almacen) {
        Scanner sc = new Scanner(System.in);
        String codigo, nombre, autor;
        Disco disco;
        boolean modificado = false;

        System.out.print("Introduzca el código del disco: ");
        codigo = sc.nextLine();

        disco = almacen.obtenerDisco(codigo);

        if(disco != null) {
            do {
                System.out.print("Introduzca el nombre del disco: ");
                nombre = sc.nextLine();
            }
            while (nombre.isBlank());

            do {
                System.out.print("Introduzca el autor del disco: ");
                autor = sc.nextLine();
            }
            while (autor.isBlank());

            disco.setNombre(nombre);
            disco.setAutor(autor);

            modificado = true;
        }

        return modificado;
    }

    private static boolean sacarDisco(Almacen almacen) {
        Scanner sc = new Scanner(System.in);
        String codigo;
        Disco disco;
        boolean sacado = false;

        System.out.print("Introduzca el código del disco: ");
        codigo = sc.nextLine();

        disco = almacen.obtenerDisco(codigo);

        if(disco != null) {
            almacen.eliminarDisco(disco);
            sacado = true;
        }

        return sacado;
    }
}