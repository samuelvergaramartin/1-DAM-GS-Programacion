package principal;

import enumerados.NotasMusicales;
import superclases.Instrumento;

public class Campana extends Instrumento {

    @Override
    public void interpretar() {
        for(NotasMusicales nota : melodia) {
            System.out.println(nota);
        }
    }
}
