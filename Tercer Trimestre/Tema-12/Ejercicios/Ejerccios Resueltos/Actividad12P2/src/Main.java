import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String tabla[] = new String[0];
        String elementoExtraido;
        Contenedor<String> contenedor = new Contenedor<>(tabla);
        contenedor.insertarAlPrincipio("Hola");
        System.out.println(contenedor.toString());
        contenedor.insertarAlPrincipio("Zapato");
        System.out.println(contenedor.toString());
        contenedor.insertarAlFinal("Adios");
        System.out.println(contenedor.toString());
        contenedor.ordenar();
        System.out.println(contenedor.toString());
        elementoExtraido = contenedor.extraerDelPrincipio();
        System.out.println(elementoExtraido);
        System.out.println(contenedor.toString());
        elementoExtraido = contenedor.extraerDelFinal();
        System.out.println(elementoExtraido);
        System.out.println(contenedor.toString());
    }
}