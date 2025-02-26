package principal;

import enumerados.NotasMusicales;

public class Main {
    public static void main(String[] args) {
        Campana campana = new Campana();

        campana.add(NotasMusicales.MI);
        campana.add(NotasMusicales.DO);
        campana.add(NotasMusicales.MI);
        campana.add(NotasMusicales.DO);

        campana.interpretar();
    }
}