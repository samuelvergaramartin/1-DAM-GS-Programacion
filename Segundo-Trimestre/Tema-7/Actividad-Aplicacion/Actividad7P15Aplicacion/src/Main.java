public class Main {
    public static void main(String[] args) {
        Calendario calendario = new Calendario(2025, 2, 18),
        calendario2 = new Calendario(2025, 2, 18);

        calendario.mostrar();

        System.out.println(calendario.iguales(calendario2));

        calendario.incrementarDia();
        calendario.incrementarMes();
        calendario.incrementarAnio();

        calendario.mostrar();

        System.out.println(calendario.iguales(calendario2));
    }
}