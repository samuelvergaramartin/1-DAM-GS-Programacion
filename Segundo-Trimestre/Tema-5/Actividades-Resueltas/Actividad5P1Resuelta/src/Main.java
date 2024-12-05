public class Main {
    public static void main(String[] args) {
        int tabla[] = new int[10], total = 0;

        for(int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) ((Math.random() * 100) + 1);
        }

        for(int e : tabla) {
            total+= e;
        }

        System.out.println("El total es: " + total);
    }
}