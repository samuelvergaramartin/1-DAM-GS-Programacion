package superclases;

import enumerados.NotasMusicales;

import java.util.Arrays;

public abstract class Instrumento {
    protected NotasMusicales[] melodia = new NotasMusicales[0];

    public void add(NotasMusicales nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    public abstract void interpretar();
}
