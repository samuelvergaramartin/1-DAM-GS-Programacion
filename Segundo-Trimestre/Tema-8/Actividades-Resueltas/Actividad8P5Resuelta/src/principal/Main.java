package principal;

import enumerados.NotasMusicales;

public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();

        piano.add(NotasMusicales.DO);
        piano.add(NotasMusicales.RE);
        piano.add(NotasMusicales.SI);
        piano.add(NotasMusicales.SOL);
        piano.add(NotasMusicales.DO);

        piano.interpretar();
    }
}