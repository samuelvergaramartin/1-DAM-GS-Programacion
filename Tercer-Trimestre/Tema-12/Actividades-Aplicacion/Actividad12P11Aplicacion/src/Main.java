public class Main {
    public static void main(String[] args) {
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);
        int alea;

        for(int i = 0; i < 30; i++) {
            alea = (int) ((Math.random() * 10) + 1);
            contenedor.insertarAlFinal(alea);
        }

        System.out.println("Mostrando contenedor antes de ordenar...");
        System.out.println(contenedor);
        contenedor.ordenar();
        System.out.println("Mostrando contenedor después de ordenar...");
        System.out.println(contenedor);
    }
}