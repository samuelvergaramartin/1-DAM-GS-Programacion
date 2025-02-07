public class Main {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("77426564P", "Samuel Vergara Martín", 90);
        Gestor gestor;

        c.setGestor(new Gestor("Pepe", "123", 800));

        gestor = c.getGestor();

        System.out.println("Gestor 1:");
        System.out.println(gestor.getNombre() + "\n"+ gestor.getTelefono() + "\n" + gestor.getImporteMaximo());

        c.setGestor(new Gestor("Pedro", "123"));

        gestor = c.getGestor();

        System.out.println("Gestor 2:");

        System.out.println(gestor.getNombre() + "\n"+ gestor.getTelefono() + "\n" + gestor.getImporteMaximo());
    }
}