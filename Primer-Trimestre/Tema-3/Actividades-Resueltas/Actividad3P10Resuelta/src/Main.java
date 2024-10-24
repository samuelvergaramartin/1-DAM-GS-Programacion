public class Main {
    public static void main(String[] args) {
        int num = 1, total = 0;
        for(int i = 1; i<= 20; i++) {
            if(num % 2 != 0) {
                total+= num;
                num++;
            }
            else num++;
        }

        System.out.println(total);
    }
}