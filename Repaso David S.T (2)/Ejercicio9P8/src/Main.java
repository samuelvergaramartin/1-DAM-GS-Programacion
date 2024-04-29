public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(1, "Alba", "21-10-2020");
        Socio socio2 = new Socio(2, "David", "27-04-2024");
        System.out.println(socio1.compareTo(socio2));
    }
}