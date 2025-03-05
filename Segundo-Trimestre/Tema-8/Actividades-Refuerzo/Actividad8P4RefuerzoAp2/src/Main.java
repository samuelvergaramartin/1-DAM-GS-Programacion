public class Main {
    public static void main(String[] args) {
        Fraccion f1, f2, f3;

        f1 = new Fraccion(3,5);
        f2 = new Fraccion(1,2);
        f3 = new Fraccion(40,25);

        System.out.println(f1.multiplicar(f2));
        System.out.println(f1.divide(f2));
        f3.simplifica();
        System.out.println(f3);
        f2.invierte();
        System.out.println(f2);
        System.out.println(f1.multiplicar(6));
        System.out.println(f2.divide(3));
    }
}