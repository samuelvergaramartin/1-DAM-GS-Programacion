public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(20, "Pepe", "01-01-2020");
        Socio socio2 = new Socio(4, "Alba", "04-05-1995");

        System.out.println(socio1.compareTo(socio2));
    }
}