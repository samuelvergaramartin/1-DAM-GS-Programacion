import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Cliente> cc = new TreeSet<>();

        cc.add(new Cliente("Maria", "123"));
        cc.add(new Cliente("Jose", "654"));
        cc.add(new Cliente("Pedro", "234"));

        System.out.println(cc);

        LinkedHashSet<Cliente> cc2 = new LinkedHashSet<>();

        cc2.add(new Cliente("Maria", "123"));
        cc2.add(new Cliente("Jose", "654"));
        cc2.add(new Cliente("Pedro", "234"));

        System.out.println(cc2);

        TreeSet<Cliente> cc3 = new TreeSet<>(new ComparaNombres());

        cc3.add(new Cliente("Maria", "123"));
        cc3.add(new Cliente("Jose", "654"));
        cc3.add(new Cliente("Pedro", "234"));

        System.out.println(cc3);
    }
}