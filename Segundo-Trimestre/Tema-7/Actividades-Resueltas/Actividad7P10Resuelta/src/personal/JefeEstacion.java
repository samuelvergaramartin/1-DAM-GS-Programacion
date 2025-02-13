package personal;

public class JefeEstacion {
    private String nombre;
    private final String DNI;
    private final String FECHA_NOMBRAMIENTO_JEFE;

    JefeEstacion(String nombre, String DNI, String FECHA_NOMBRAMIENTO_JEFE) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.FECHA_NOMBRAMIENTO_JEFE = FECHA_NOMBRAMIENTO_JEFE;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFECHA_NOMBRAMIENTO_JEFE() {
        return FECHA_NOMBRAMIENTO_JEFE;
    }
}
