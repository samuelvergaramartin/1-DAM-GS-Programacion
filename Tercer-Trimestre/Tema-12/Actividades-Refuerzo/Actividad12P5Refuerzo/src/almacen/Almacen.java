package almacen;

import comparadores.ComparaAutores;
import discos.Disco;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Almacen {
    private Set<Disco> almacen;

    public Almacen() {
        almacen = new LinkedHashSet<>();
    }

    public boolean guardar(Disco disco) {
        return almacen.add(disco);
    }

    public Disco obtenerDisco(String codigo) {
        Disco disco = null, elemento;
        Iterator<Disco> iterator = almacen.iterator();

        while (iterator.hasNext() && disco == null) {
            elemento = iterator.next();
            if(elemento.getCODIGO().equals(codigo)) disco = elemento;
        }

        return disco;
    }

    public boolean eliminarDisco(Disco disco) {
        return almacen.remove(disco);
    }

    public Disco[] obtenerDiscosOrdenadosPorNombre() {
        return new TreeSet<>(almacen).toArray(new Disco[0]);
    }

    public Disco[] obtenerDiscosOrdenadosPorAutor() {
        ComparaAutores comparaAutores = new ComparaAutores();
        Set<Disco> discos = new TreeSet<>(comparaAutores);

        discos.addAll(almacen);

        return discos.toArray(new Disco[0]);
    }

    @Override
    public String toString() {
        return almacen.toString();
    }
}
