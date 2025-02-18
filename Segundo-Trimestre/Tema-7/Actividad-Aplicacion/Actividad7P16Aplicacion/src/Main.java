public class Main {
    public static void main(String[] args) {
        Punto punto1, punto2;

        punto1 = new Punto(10, 6);
        punto2 = new Punto(20, 6);

        punto1.muestra();
        punto1.desplazaX(4);
        punto1.muestra();
        punto1.desplazaY(2);
        punto1.muestra();
        punto1.desplaza(3,3);
        punto1.muestra();

        System.out.println(punto1.distanciaEuclidea(punto2));
    }
}