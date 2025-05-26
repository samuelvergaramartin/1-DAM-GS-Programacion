import java.util.*;

public class Agenda {
    private Map<String, Contacto> contactos;

    public Agenda() {
        contactos = new HashMap<>();
    }

    public boolean agregarContacto(Contacto contacto) {
        boolean agregado = false;

        if(!contactos.containsKey(contacto.getTelefono())) {
            contactos.put(contacto.getTelefono(), contacto);
            agregado = true;
        }

        return agregado;
    }

    public Contacto obtenerContacto(String telefono) {
        return contactos.get(telefono);
    }

    public Collection<Contacto> obtenerContactos() {
        return contactos.values();
    }

    public String[] buscarPorNombre(String nombre) {
        ArrayList<String> contactos = new ArrayList<>();

        for(String n : this.contactos.keySet()) {
            if(this.contactos.get(n).getNombre().startsWith(nombre)) contactos.add(n);
        }

        return contactos.toArray(new String[0]);
    }
}
