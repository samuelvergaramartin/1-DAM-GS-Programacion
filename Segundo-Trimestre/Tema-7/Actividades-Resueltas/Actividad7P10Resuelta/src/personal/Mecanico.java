package personal;

public class Mecanico {
    private String nombre;
    private String telefono;
    private EspecialidadesMecanicos especialidad;


    public Mecanico(String nombre, String telefono, EspecialidadesMecanicos especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEspecialidad(EspecialidadesMecanicos especialidad) {
        this.especialidad = especialidad;
    }

    public EspecialidadesMecanicos getEspecialidad() {
        return especialidad;
    }
}
