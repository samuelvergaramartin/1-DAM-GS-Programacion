import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final String directory = "FicherosActividad12P15/";
        Map<String, Integer> productos;
        Scanner sc = new Scanner(System.in), sc2 = new Scanner(System.in), sc3 = new Scanner(System.in);
        int stock, option = -1;
        boolean ok;
        String nombreProducto, menu = """
                Menu de opciones:
                1 - Dar de alta un producto
                2 - Dar de baja un producto
                3 - Ver todos los productos
                4 - Actualizar el stock de un producto
                0 - Salir
                """;
        ok = prepararFichero(directory);
        productos = obtenerProductosFichero(directory);
        if(!ok) {
            System.out.println("ERROR: No se pudo preparar el fichero!");
        }
        else {
            do {
                System.out.println(menu);
                System.out.print("Seleccione una opciṕn: ");
                option = sc.nextInt();
                switch (option) {
                    case 0: {
                        System.out.println("Guardando datos en el fichero...");
                        ok = escribirProductosFichero(directory, productos);
                        if(ok) System.out.println("Se han guardado correctamente los productos en el fichero");
                        else System.out.println("ERROR: Se ha producido un error al guardar los productos en el fichero");
                        System.out.println("Saliendo del programa...");
                    }
                    break;
                    case 1: {
                        System.out.print("Introduzca el nombre del nuevo producto: ");
                        nombreProducto = sc2.nextLine();
                        if (productos.get(nombreProducto) == null) {
                            System.out.println(nombreProducto);
                            productos.put(nombreProducto, 0);
                            System.out.println("El producto se ha dado de alta correctamente");
                        }
                        else System.out.println("Error: El producto ya esta dado de alta.");
                    }
                    break;
                    case 2: {
                        System.out.print("Introducd el nombre del producto que deseas dar de baja: ");
                        nombreProducto = sc2.nextLine();
                        if (productos.get(nombreProducto) != null) {
                            productos.remove(nombreProducto);
                            System.out.println("El producto ha sido dado de baja correctamente");
                        } else System.out.println("Error: El producto introducido no existe");
                    }
                    break;
                    case 3: {
                        System.out.println("Listado de todos los productos:");
                        System.out.println(productos);
                    }
                    break;
                    case 4: {
                        System.out.print("Introduzca el nombre del producto: ");
                        nombreProducto = sc2.nextLine();
                        if (productos.get(nombreProducto) == null)
                            System.out.println("ERROR: El producto introducido no existe");
                        else {
                            System.out.print("Introduzca el nuevo stock del producto: ");
                            stock = sc3.nextInt();
                            if (stock < 0)
                                System.out.println("ERROR: El stock del producto no puede ser un numero negativo");
                            else {
                                productos.put(nombreProducto, stock);
                                System.out.println("El stock del producto ha sido actualizado correctamente");
                            }
                        }
                    }
                    break;
                }
            }
            while (option != 0);
        }
    }
    static Map<String, Integer> obtenerProductosFichero(String directory) {
        Map<String, Integer> productos;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(directory + "productos.so"))){

            productos = (Map<String, Integer>) in.readObject();
        }
        catch (ClassNotFoundException ex) {
            productos = new TreeMap<>();
        }
        catch (EOFException ex) {
            productos = new TreeMap<>();
        }
        catch (IOException exception) {
            productos = new TreeMap<>();
            System.out.println(exception);
        }

        return productos;
    }
    static boolean prepararFichero(String directory) {
        boolean ok;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(directory + "productos.so"))) {
            ok = true;
        }
        catch(FileNotFoundException notFoundEx) {
            ok = false;
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "productos.so"))){
                ok = true;
            }
            catch (IOException exception) {
                ok = false;
                System.out.println(exception);
            }
        }
        catch (IOException exception) {
            ok = false;
            System.out.println(exception);
        }
        return ok;
    }
    static boolean escribirProductosFichero(String directory, Map<String, Integer> mapa) {
        boolean ok;
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory + "producto.so"))) {
            out.writeObject(mapa);
            ok = true;
        }
        catch (IOException exception) {
            ok = false;
            System.out.println(exception);
        }

        return ok;
    }
}