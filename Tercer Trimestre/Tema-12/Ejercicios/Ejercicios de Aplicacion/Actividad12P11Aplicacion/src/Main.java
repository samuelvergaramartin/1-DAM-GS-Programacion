public class Main {
    public static void main(String[] args) {
        Integer tabla[] = new Integer[0], n;
        Contenedor<Integer> miContenedor = new Contenedor<>(tabla);

        for(int i = 1; i <= 30; i++) {
            miContenedor.insertarAlFinal((int) ((Math.random() * 10) + 1));
        }

        System.out.println("Contenedor antes de ordenar: ");
        System.out.println(miContenedor.toString());

        miContenedor.ordenar();

        System.out.println("Contenedor ordenado:");
        System.out.println(miContenedor.toString());
    }
}