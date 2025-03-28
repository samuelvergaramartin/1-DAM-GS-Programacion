import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> c1 = new ArrayList<>(), c2 = new ArrayList<>();

        for(int i = 0; i < 20; i++) {
            c1.add((int) ((Math.random() * 10) + 1));
        }

        for(Integer e : c1) {
            if(!c2.contains(e)) c2.add(e);
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}