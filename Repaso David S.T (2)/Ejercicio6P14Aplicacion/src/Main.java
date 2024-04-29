import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input, contactos[], menu;
        int in, opt = -1;

        menu = """
                AGENDA: Menu principal
                1 - Añadir nuevo contacto (nombre y teléfono)
                2 - Buscar el teléfono de un contacto a partir de su nombre
                3 - Mostrar la información de todos los contactos ordenados alfabéticamente por su nombre.
                0 - Kill -9 PID_OF_THIS_PROGRAM
                """;

        do {
            System.out.println(menu);
            System.out.print("Introduzca una opción: ");
            opt = sc.nextInt();
            switch (opt)  {
                case 1:
            }
        }
        while(opt != 0);
    }
    static String[] addContact(String[] contactos, int in) {
        String result[] = null;
        String nombres[] = new String[contactos.length];
        String telefonos[] = new String[contactos.length];

        for(int i = 0; i < nombres.length; i++) {
            String nombre = contactos[i].split(":")[0];
            String telefono = contactos[i].split(":")[1];
        }

        return result;
    }
}