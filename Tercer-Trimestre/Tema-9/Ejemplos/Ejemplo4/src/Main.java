import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio socio1, socio2, socio3, socios[] = new Socio[3];
        ComparaEdades comparaEdades = new ComparaEdades();
        ComparaNombres comparaNombres = new ComparaNombres();

        socio1 = new Socio(1, "A", "10-10-2010");
        socio2 = new Socio(1, "B", "17-10-2020");
        socio3 = new Socio(2, "C", "20-10-2021");

        socios[0] = socio1;
        socios[1] = socio2;
        socios[2] = socio3;

        Arrays.sort(socios, comparaEdades);

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios, comparaEdades.reversed());

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios, comparaNombres);

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios, comparaNombres.reversed());

        System.out.println(Arrays.toString(socios));
    }
}