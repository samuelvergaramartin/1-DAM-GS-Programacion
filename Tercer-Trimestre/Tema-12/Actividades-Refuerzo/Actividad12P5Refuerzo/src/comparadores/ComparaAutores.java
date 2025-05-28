package comparadores;

import discos.Disco;

import java.util.Comparator;

public class ComparaAutores implements Comparator<Disco> {
    @Override
    public int compare(Disco o1, Disco o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
