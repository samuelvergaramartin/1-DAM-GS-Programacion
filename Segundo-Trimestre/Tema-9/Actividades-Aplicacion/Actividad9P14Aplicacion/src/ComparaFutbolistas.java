import java.util.Comparator;

public class ComparaFutbolistas implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int resultado;

        if(((Futbolista) o1).getEdad() - ((Futbolista) o2).getEdad() == 0) {
            resultado = ((Futbolista) o1).getNombre().compareTo(((Futbolista) o2).getNombre());
        }
        else resultado = ((Futbolista) o1).getEdad() - ((Futbolista) o2).getEdad();

        return resultado;
    }
}
