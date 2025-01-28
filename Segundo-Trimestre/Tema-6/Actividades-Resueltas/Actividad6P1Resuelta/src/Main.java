public class Main {
    public static void main(String[] args) {
        for(char c = '\u0000'; c < '\uFFFF'; c++) {
            System.out.println(c + " -> " + Character.hashCode(c).);
        }
    }
}