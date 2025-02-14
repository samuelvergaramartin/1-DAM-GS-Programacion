public class Main {
    public static void main(String[] args) {
        MarcaPagina marcaPaginas = new MarcaPagina();

        System.out.println(marcaPaginas.getNumeroPagina());
        System.out.println(marcaPaginas.obtenerInformacionUltimaPaginaLeida());

        marcaPaginas.incrementarPagina();

        System.out.println(marcaPaginas.getNumeroPagina());
        System.out.println(marcaPaginas.obtenerInformacionUltimaPaginaLeida());

        marcaPaginas.empezarNuevaLectura();

        System.out.println(marcaPaginas.getNumeroPagina());
        System.out.println(marcaPaginas.obtenerInformacionUltimaPaginaLeida());
    }
}