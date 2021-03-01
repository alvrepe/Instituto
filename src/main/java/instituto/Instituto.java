package instituto;

import instituto.exceptions.NoHayGrupoException;

import java.util.Arrays;
import java.util.Objects;

public class Instituto implements IInstituto {
    private String nombre;
    private Grupo[] grupos;

    public Instituto(String nombre, Grupo[] grupos) {
        this.nombre = nombre;
        this.grupos = grupos;
    }

    @Override
    public void printInfo() {
        System.out.println("Instituto " + nombre);
        for (int i = 0; i < grupos.length; i++) {

            Grupo grupo = grupos[i];
            grupo.printInfo();
        }
    }

    @Override
    public void printAlumnosEnCp(int cp) {
        for (Grupo grupo : grupos) {
            grupo.printAlumnosEnCp(cp);
        }
    }

    @Override
    public Alumno[] findAlumnos(String name) throws NoHayGrupoException {
        Grupo grupo = finGroup(name);

        if (grupo != null) {
            return grupo.getAlumnos();
        } else {
            throw new NoHayGrupoException();
        }

    }

    public Grupo finGroup(String name) {
        Grupo res = null;

        for (Grupo grupo : grupos) {
            if (grupo.getNombre().equals(name)) {
                res = grupo;
            }
        }
        return res;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo[] getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo[] grupos) {
        this.grupos = grupos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Instituto)) return false;
        Instituto instituto = (Instituto) o;
        return Objects.equals(getNombre(), instituto.getNombre()) && Arrays.equals(getGrupos(), instituto.getGrupos());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNombre());
        result = 31 * result + Arrays.hashCode(getGrupos());
        return result;
    }
}
