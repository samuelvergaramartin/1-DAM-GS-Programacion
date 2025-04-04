import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Producto> productos = new TreeMap<>();
        Scanner sc;
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1: {
                    String nombre;
                    int stockInicial;
                    sc = new Scanner(System.in);
                    Producto p;

                    System.out.print("Introduce el nombre del nuevo producto: ");
                    nombre = sc.nextLine();

                    do {
                        System.out.print("Introduzca el stock inicial del nuevo producto: ");
                        stockInicial = sc.nextInt();
                    }
                    while (stockInicial < 0);

                    p = new Producto(nombre, stockInicial);

                    productos.put(p.getCODIGO(), p);

                    System.out.println("Se ha dado de alta correctamente el producto");

                    break;
                }
                case 2: {
                    String codigo;
                    sc = new Scanner(System.in);

                    System.out.print("Introduzca el código del producto que desea borrar: ");
                    codigo = sc.nextLine();

                    if(!productos.containsKey(codigo)) {
                        System.out.println("Error: No existe el producto.");
                    }
                    else {
                        productos.remove(codigo);
                        System.out.println("Se ha dado de baja correctamente el producto.");
                    }

                    break;
                }
                case 3: {
                    String codigo;
                    int nuevoStock;
                    sc = new Scanner(System.in);

                    System.out.print("Introduzca el código del producto: ");
                    codigo = sc.nextLine();

                    if(!productos.containsKey(codigo)) {
                        System.out.println("Error: No existe el producto.");
                    }
                    else {
                        do {
                            System.out.print("Introduzca el nuevo stock: ");
                            nuevoStock = sc.nextInt();
                        }
                        while (nuevoStock < 0);

                        productos.get(codigo).setStock(nuevoStock);
                        System.out.println("Se ha actualizado el stock del producto correctamente.");

                        break;
                    }
                }
                case 4: {
                    Set<Map.Entry<String, Producto>> entradas = productos.entrySet();

                    for(Map.Entry<String, Producto> e : entradas) {
                        System.out.println("Producto: " + e.getKey());
                        System.out.println(e.getValue() + "\n");
                    }

                    break;
                }
                case 5: {
                    System.out.println("Saliendo del programa...");

                    break;
                }
                default: {
                    System.out.println("Error: Opción no válida");

                    break;
                }
            }
        }
        while (opcion != 5);
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        final String MENU = """
                Menu
                1- Dar de alta un producto
                2- Dar de baja un producto
                3- Modificar el stock de un producto
                4- Listar los productos ordenados por código
                5- Salir
                """;
        System.out.println(MENU);
        System.out.print("Seleccione una opción: ");

        return sc.nextInt();
    }
}