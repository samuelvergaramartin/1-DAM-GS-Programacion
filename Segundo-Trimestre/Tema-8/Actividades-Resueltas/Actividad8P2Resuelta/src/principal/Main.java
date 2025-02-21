package principal;

public class Main {
    public static void main(String[] args) {
        HoraExacta hora = new HoraExacta(10, 59, 59);

        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        hora.setSegundos(59);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        hora.setHora(23);
        hora.setMinutos(59);
        hora.setSegundos(59);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
    }
}