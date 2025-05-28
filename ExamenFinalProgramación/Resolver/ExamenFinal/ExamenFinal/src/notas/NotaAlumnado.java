package notas;

import java.util.*;

public class NotaAlumnado {
    private static Map<Integer, Set<NotaAlumnado>> notasAlumnos;
    private String fecha;
    private double nota;

    static {
        notasAlumnos = new LinkedHashMap<>();
    }

    public NotaAlumnado(String fecha, double nota) {
        setFecha(fecha);
        setNota(nota);
    }

    public static boolean introducirNota(Integer nie, NotaAlumnado n) {
        if(!notasAlumnos.containsKey(nie)) notasAlumnos.put(nie, new LinkedHashSet<>());

        return notasAlumnos.get(nie).add(n);
    }

    public static boolean eliminarTodasNotasAlumnado(Integer nie) {
        boolean eliminado = false;

        if(notasAlumnos.containsKey(nie)) {
            if(!notasAlumnos.get(nie).isEmpty()) {
                notasAlumnos.get(nie).clear();
                eliminado = true;
            }
        }

        return eliminado;
    }

    public static Set<Integer> codigosAlumnado() {
        return notasAlumnos.keySet();
    }

    public static Iterator<NotaAlumnado> notasAlumnado(Integer nie) {
        Iterator<NotaAlumnado> it = null;

        if(notasAlumnos.containsKey(nie)) it = notasAlumnos.get(nie).iterator();

        return it;
    }

    public static boolean alumnoConNotas(Integer nie) {
        return notasAlumnos.containsKey(nie) && !(notasAlumnos.get(nie).isEmpty());
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota >= 0.0 && nota <= 10.0) this.nota = nota;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof NotaAlumnado)) return false;

        return fecha.equals(((NotaAlumnado) obj).fecha);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {\n\tFecha: " + fecha + "\n\tNota: " + nota + "\n}";
    }
}
