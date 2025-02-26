package principal;

public class Main {
    public static void main(String[] args) {
        ColaDoble coladoble = new ColaDoble();

        System.out.println(coladoble);
        coladoble.encolar(1);
        System.out.println(coladoble);
        coladoble.encolar(2);
        System.out.println(coladoble);
        System.out.println(coladoble.desencolar());
        System.out.println(coladoble);
        coladoble.encolarPrincipio(4);
        System.out.println(coladoble);
        System.out.println(coladoble.desencolarFinal());
        System.out.println(coladoble);
    }
}