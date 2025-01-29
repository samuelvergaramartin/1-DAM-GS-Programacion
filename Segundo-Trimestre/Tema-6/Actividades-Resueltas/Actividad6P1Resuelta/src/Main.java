public class Main {
    public static void main(String[] args) {
        for(int c = 0x0000; c < 0xFFFF; c++) {
            System.out.println((char) c + " -> " + c);
        }
    }
}