package principal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio socio1, socio2, socios[];
        ComparaEdades comparaEdades = new ComparaEdades();

        socio1 = new Socio(1, "A", "20-10-2020");
        socio2 = new Socio(2, "B", "10-01-2001");

        socios = new Socio[2];
        socios[0] = socio1;
        socios[1] = socio2;

        Arrays.sort(socios, comparaEdades.reversed());

        System.out.println(Arrays.toString(socios));
    }
}