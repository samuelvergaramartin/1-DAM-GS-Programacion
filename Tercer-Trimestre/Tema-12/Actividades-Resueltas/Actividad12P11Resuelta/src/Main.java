import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc;
        Contenedor<Socio> contenedor = new Contenedor<>();

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    sc = new Scanner(System.in);
                    String nombre, dni, fechaDeAlta;
                    System.out.print("Ingrese el nombre del nuevo socio: ");
                    nombre = sc.nextLine();

                    System.out.print("Ingrese el dni del nuevo socio: ");
                    dni = sc.nextLine();

                    System.out.print("Ingrese la fecha de alta del nuevo socio: ");
                    fechaDeAlta = sc.nextLine();

                    if(contenedor.insertarElemento(new Socio(dni, nombre, fechaDeAlta))) {
                        System.out.println("Se ha dado de alta correctamente al nuevo socio");
                    }
                    else System.out.println("Error al dar de alta el nuevo socio, ya existe en el sistema.");

                    break;
                }
                case 2: {
                    sc = new Scanner(System.in);
                    String dni;
                    int i = 0;

                    System.out.print("Ingrese el dni del socio: ");
                    dni = sc.nextLine();

                    while (i < contenedor.obtenerNumeroElementos() && !contenedor.obtenerElemento(i).getDNI().equals(dni)) {
                        i++;
                    }

                    if(contenedor.eliminarElemento(i)) {
                        System.out.println("Se ha eliminado correctamente al socio");
                    }
                    else System.out.println("Error al eliminar socio, no existe en el sistema.");

                    break;
                }
                case 3: {
                    sc = new Scanner(System.in);
                    String dni, nombre, fechaDeAlta;
                    int i = 0;

                    System.out.print("Ingrese el DNI del socio: ");
                    dni = sc.nextLine();

                    System.out.print("Ingrese el nombre del socio: ");
                    nombre = sc.nextLine();

                    while (i < contenedor.obtenerNumeroElementos() && !contenedor.obtenerElemento(i).getDNI().equals(dni)) {
                        i++;
                    }

                    if(contenedor.obtenerElemento(i) != null) {
                        fechaDeAlta = contenedor.obtenerElemento(i).getFECHA_ALTA();
                        contenedor.modificarElemento(i, new Socio(dni, nombre, fechaDeAlta));
                        System.out.println("Se ha modificado correctamente al socio");
                    }
                    else System.out.println("Error al modificar al socio, no existe en el sistema.");

                    break;
                }
                case 4: {
                    contenedor.ordenar(Comparator.naturalOrder());
                    System.out.println(contenedor);

                    break;
                }
                case 5: {
                    contenedor.ordenar(new ComparaFechas());
                    System.out.println(contenedor);

                    break;
                }
                case 6: {
                    System.out.println("Saliendo del programa...");

                    break;
                }
                default: {
                    System.out.println("Error: Opción no valida");

                    break;
                }
            }
        }
        while (opcion != 6);
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                      ---MENU---
                1- Dar de alta un socio
                2- Dar de baja un socio
                3- Modificar un socio
                4- Listar socios por DNI
                5- Listar socios por Fecha de Alta
                6- Salir
                """;
        System.out.println(MENU);
        System.out.print("Introduzca una opcion: ");
        return sc.nextInt();
    }
}