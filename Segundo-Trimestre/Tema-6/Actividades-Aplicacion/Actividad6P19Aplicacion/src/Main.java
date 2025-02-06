import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto, palabra, otraPalabra;

        do {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
        }
        while (texto.isBlank());

        do {
            System.out.print("Introduce cual palabra cambiar: ");
            palabra = sc.nextLine();
        }
        while (!texto.contains(palabra) && palabra.isBlank());

        do {
            System.out.print("Introduce la palabra por la que deseas cambiarla: ");
            otraPalabra = sc.nextLine();
        }
        while (otraPalabra.isBlank());

        texto = texto.replaceAll(palabra, otraPalabra);
        System.out.println("Se ha cambiado satisfactoriamente la palabra \"" + palabra + "\" por \"" +  otraPalabra + "\" en todo el texto");
        System.out.println(texto);
    }
}