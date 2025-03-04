public class Main {
    public static void main(String[] args) {
        Pizza p1, p2, p3;

        verEstadosPizzas();

        p1 = new Pizza("mediana", TiposPizza.MARGARITA);

        System.out.println(p1.getEstado());
        verEstadosPizzas();

        p2 = new Pizza("Familiar", TiposPizza.FUNGHI);

        System.out.println(p2.getEstado());
        verEstadosPizzas();

        p1.sirve();
        System.out.println(p1.getEstado());
        verEstadosPizzas();

        p1.sirve();
        verEstadosPizzas();

        p3 = new Pizza("familiar", TiposPizza.CUATROQUESOS);
        p2.sirve();
        verEstadosPizzas();
    }

    private static void verEstadosPizzas() {
        System.out.println("Pizzas pedidas: " + Pizza.totalPizzasPedidas);
        System.out.println("Pizzas servidas: " + Pizza.totalPizzasServidas);
    }
}