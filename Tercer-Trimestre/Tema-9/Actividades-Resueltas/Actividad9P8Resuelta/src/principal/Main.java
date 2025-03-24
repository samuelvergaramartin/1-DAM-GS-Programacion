package principal;

public class Main {
    public static void main(String[] args) {
        Socio socio1, socio2, socio3;

        socio1 = new Socio(1, "A", "10-10-2010");
        socio2 = new Socio(2, "A", "10-10-2010");
        socio3 = new Socio(3, "B", "10-10-2010");

        System.out.println(socio1.compareTo(socio3));
        System.out.println(socio1.compareTo(socio2));
        System.out.println(socio3.compareTo(socio1));
    }
}