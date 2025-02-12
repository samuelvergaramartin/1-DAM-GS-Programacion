import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Texto texto = new Texto(15);
        texto.agregarCadenaAlFinal("mundo");
        System.out.println(texto.getCadena());
        texto.agregarCadenaAlPrincipio("Hola ");
        System.out.println(texto.getFechaYHoraUltimaModificacion());
        System.out.println(texto.getCadena());
        texto.agregarCaracterAlFinal('!');
        System.out.println(texto.getCadena());
        texto.agregarCaracterAlPrincipio('¡');
        System.out.println(texto.getCadena());

        System.out.println("Longitud máxima de la cadena: " + texto.getLongitudMaxima());
        System.out.println("Número de vocales: " + texto.getNumVocales());

        System.out.println("Fecha de creación: " + texto.getFechaCreacion());
        System.out.println("Fecha y hora de la ultima modificacion: " + texto.getFechaYHoraUltimaModificacion());
    }
}