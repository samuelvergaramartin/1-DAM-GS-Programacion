package principal;

public class Main {
    public static void main(String[] args) {
        HoraExacta hora = new HoraExacta(10, 59, 59);
        HoraExacta hora2 = new HoraExacta(0,0,0);

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

        System.out.println(hora2);
        System.out.println(hora.equals(hora2));
        hora2.inc();
        System.out.println(hora.equals(hora2));
    }
}