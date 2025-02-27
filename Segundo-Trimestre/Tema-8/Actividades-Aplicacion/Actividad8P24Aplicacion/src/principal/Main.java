package principal;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(12.4, 43.2);
        Rectangulo rectangulo = new Rectangulo(8.2, 2.1);

        System.out.println("Area del triangulo: " + triangulo.area());
        System.out.println("Area del rectangulo: " + rectangulo.area());
    }
}