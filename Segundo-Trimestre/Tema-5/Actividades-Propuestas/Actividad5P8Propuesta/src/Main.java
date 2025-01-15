public class Main {
    public static void main(String[] args) {
        int tabla1[] = {1,2,3}, tabla2[] = {1,2,3};

        System.out.println(tabla1 == tabla2);
        System.out.println(java.util.Arrays.equals(tabla1, tabla2));
    }
}