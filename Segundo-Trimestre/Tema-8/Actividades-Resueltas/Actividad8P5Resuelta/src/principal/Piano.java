package principal;

import enumerados.NotasMusicales;
import superclases.Instrumento;

import java.util.Arrays;

public class Piano extends Instrumento {

    @Override
    public void interpretar() {
        for (NotasMusicales nota : melodia) {
            System.out.println(nota);
        }
    }
}
