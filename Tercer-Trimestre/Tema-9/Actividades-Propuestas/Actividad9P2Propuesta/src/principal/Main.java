package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);
        lista.encolarCabeza(1);
        System.out.println(lista);
        lista.encolarCabeza(2);
        System.out.println(lista);
        System.out.println(lista.desencolarFinal());
        System.out.println(lista);
    }
}