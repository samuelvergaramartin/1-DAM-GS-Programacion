package principal;

public class Main {
    public static void main(String[] args) {
        CajaCarton caja = new CajaCarton(10, 24, 43);

        caja.setEtiqueta("Caja de carton");

        System.out.println(caja);
    }
}