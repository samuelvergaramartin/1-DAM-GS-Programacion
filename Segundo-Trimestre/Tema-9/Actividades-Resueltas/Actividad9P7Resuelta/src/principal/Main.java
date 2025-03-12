package principal;

public class Main {
    public static void main(String[] args) {
        Socio socio1, socio2, socio3;

        socio1 = new Socio(1, "A", "10-10-2010");
        socio2 = new Socio(1, "B", "17-10-2020");
        socio3 = new Socio(2, "C", "20-10-2021");

        System.out.println(socio1);
        System.out.println(socio2);
        System.out.println(socio3);

        System.out.println(socio1.compareTo(socio3));
        System.out.println(socio1.compareTo(socio2));
        System.out.println(socio3.compareTo(socio1));
    }
}