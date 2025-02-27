public class Main {
    public static void main(String[] args) {
        Objeto objeto1 = new Objeto(), o2, o3, o4, o5, o6, o7, o8, o9,o10, o11;

        for (int i = 0; i < 100; i++) {
            objeto1 = new Objeto();
        }
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex) {};

    }
}