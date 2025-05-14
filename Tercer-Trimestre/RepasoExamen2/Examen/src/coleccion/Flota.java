package coleccion;

import embarcaciones.Barco;
import java.util.LinkedHashSet;
import java.util.Set;

public class Flota {
    private Set<Barco> flota;

    public Flota() {
        flota = new LinkedHashSet<>();
    }

    public int numeroElementos() {
        return flota.size();
    }

    public boolean insertarBarco(Barco barco) {
        return flota.size() < 20 && flota.add(barco);
    }

    public boolean eliminarBarco(Barco barco) {
        return flota.remove(barco);
    }

    public Barco[] arrayBarcos() {
        return flota.toArray(new Barco[0]);
    }
}
