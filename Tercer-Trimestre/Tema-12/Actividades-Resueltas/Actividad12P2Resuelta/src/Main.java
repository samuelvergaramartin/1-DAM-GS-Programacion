public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);

        System.out.println(contenedor);
        contenedor.insertarAlFinal(1);
        System.out.println(contenedor);
        contenedor.insertarAlPrincipio(2);
        System.out.println(contenedor);
        contenedor.insertarAlPrincipio(3);
        System.out.println(contenedor);
        System.out.println("Ordenando array...");
        contenedor.ordenar();
        System.out.println(contenedor);
        System.out.println(contenedor.extraerDelFinal());
        System.out.println(contenedor);
        System.out.println(contenedor.extraerDelPrincipio());
        System.out.println(contenedor);
    }
}