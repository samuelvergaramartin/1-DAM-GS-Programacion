package principal;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        System.out.println(lista);
        lista.encolar(1);
        System.out.println(lista);
        lista.encolar(2);
        System.out.println(lista);
        lista.encolarMultiple(3, 5);
        System.out.println(lista);
    }
}