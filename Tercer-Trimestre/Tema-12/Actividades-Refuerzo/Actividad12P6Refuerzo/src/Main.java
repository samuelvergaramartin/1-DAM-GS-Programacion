import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> credenciales = new HashMap<>();
        String usuario, password;
        int intentos = 3;
        boolean acceso = false;
        Scanner sc = new Scanner(System.in);

        credenciales.put("Sam170703dev", "123456789");

        do {
            System.out.print("Usuario: ");
            usuario = sc.nextLine();

            System.out.print("Password: ");
            password = sc.nextLine();

            if(credenciales.get(usuario) != null && credenciales.get(usuario).equals(password)) acceso = true;
            else System.out.println("Error: Credenciales incorrectas.");

            intentos--;
        }
        while (!acceso && intentos > 0);

        if(acceso) System.out.println("Ha accedido al área restringida.");
        else System.out.println("Lo siento, no tiene acceso al área restringida.");
    }
}