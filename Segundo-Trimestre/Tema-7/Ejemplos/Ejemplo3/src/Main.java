public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 50);

        p.setSexo('H');

        System.out.println(p.getSexo());
    }
}