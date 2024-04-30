public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> c1 = new Contenedor<Integer>();
        Contenedor<Integer> c2 = new Contenedor<>();
        Contenedor<String> c3 = new Contenedor<>();

        c1.guardar(5);
        System.out.println(c1.extraer());
        System.out.println(c1.extraer());

        c3.guardar("IES Belén");
    }
}