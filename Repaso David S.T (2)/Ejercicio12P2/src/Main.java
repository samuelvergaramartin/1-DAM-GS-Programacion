public class Main {
    public static void main(String[] args) {
        Integer tabla[] = new Integer[0];
        Contenedor<Integer> miContenedor = new Contenedor<>(tabla);
        mostrar(miContenedor);
        miContenedor.insertarAlFinal(1);
        mostrar(miContenedor);
        miContenedor.insertarAlFinal(2);
        mostrar(miContenedor);
        miContenedor.insertarAlPrincipio(3);
        mostrar(miContenedor);
        miContenedor.ordenar();
        mostrar(miContenedor);
        miContenedor.extraerDelPrincipio();
        mostrar(miContenedor);
        miContenedor.extraerDelFinal();
        mostrar(miContenedor);
    }
    static void mostrar(Contenedor c) {
        System.out.println(c.toString());
    }
}