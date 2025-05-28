package principal;

import alumnos.Alumnado;
import alumnos.AlumnadoNEAE;
import notas.NotaAlumnado;

import java.util.ArrayList;
import java.util.Iterator;

public class GrupoAlumnado {
    private ArrayList<Alumnado> alumnos;

    public GrupoAlumnado() {
        alumnos = new ArrayList<>();
    }

    public boolean inscribirAlumno(Alumnado alumnado) {
        boolean introducido = false;

        if(!alumnos.contains(alumnado)) {
            alumnos.add(alumnado);
            introducido = true;
        }

        return introducido;
    }

    public boolean eliminarAlumno(Alumnado alumnado) {
        return alumnos.remove(alumnado);
    }

    public boolean insertarNotaAlumnado(Integer nie, NotaAlumnado nota) {
        boolean insertado = false;
        Alumnado alumno = encontrarPorNie(nie);

        if(alumno != null) {
            if(alumno instanceof AlumnadoNEAE) {
                double notaCalculada = ((AlumnadoNEAE) alumno).calculoNota(nota.getNota());
                nota.setNota(notaCalculada);
                insertado = NotaAlumnado.introducirNota(nie, nota);
            }
            else insertado = NotaAlumnado.introducirNota(nie, nota);
        }

        return insertado;
    }

    public Alumnado encontrarPorNie(Integer nie) {
        Alumnado alumno = null, seleccionado;
        Iterator<Alumnado> iterator = alumnos.iterator();

        while(iterator.hasNext() && alumno == null) {
            seleccionado = iterator.next();

            if(seleccionado.getNIE() == nie) alumno = seleccionado;
        }

        return alumno;
    }

    @Override
    public String toString() {
        return alumnos.toString();
    }
}
