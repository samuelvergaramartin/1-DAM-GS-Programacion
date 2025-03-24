package principal;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "A", "10-10-2010"),
                new Socio(3, "A", "10-10-2010"),
                new Socio(2, "A", "10-10-2010"),

        };

        System.out.println(socios[0].compareTo(socios[2]));
        System.out.println(socios[1].compareTo(socios[0]));
    }
}