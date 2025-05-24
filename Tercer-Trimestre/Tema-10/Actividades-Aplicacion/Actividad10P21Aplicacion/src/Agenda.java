import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contacto> contactos;

    public Agenda() {
        contactos = new HashMap<String, Contacto>();
    }

    public boolean agregarContacto(Contacto contacto) {
        boolean agregado = false;

        if(!contactos.containsKey(contacto.getTelefono())) {
            contactos.put(contacto.getTelefono(), contacto);
            agregado = true;
        }

        return agregado;
    }

    public boolean eliminarContacto(String telefono) {
        return contactos.remove(telefono) != null;
    }

    public Contacto obtenerContacto(String telefono) {
        return contactos.get(telefono);
    }
}
