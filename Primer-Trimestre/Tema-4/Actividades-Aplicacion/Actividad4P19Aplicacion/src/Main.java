public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    private static void aleatorio(int cantidad, int max, int min) {
        int num;
        for(int i = 1; i <= cantidad; i++) {
            num = (int)((Math.random() * max) + min);
            System.out.println(num);
        }
    }
}