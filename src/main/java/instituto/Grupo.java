package instituto;

import java.util.Arrays;
import java.util.Objects;

public class Grupo {

    private String nombre;
    private String aula;
    private Alumno[] alumnos;

    public Grupo(String nombre, String aula, Alumno[] alumnos) {
        this.nombre = nombre;
        this.aula = aula;
        this.alumnos = alumnos;
    }

    public void printInfo() {
        System.out.println("Grupo " + nombre + ", aula " + aula);
        System.out.println("Alumnos: ");
        for (Alumno alumno : alumnos) {
            alumno.printInfo();
        }
    }

    public void printAlumnosEnCp(int cp) {
        for (Alumno alumno : alumnos) {
            if (alumno.getCp() == cp) {
                alumno.printInfo();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(getNombre(), grupo.getNombre()) && Objects.equals(getAula(), grupo.getAula()) && Arrays.equals(getAlumnos(), grupo.getAlumnos());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNombre(), getAula());
        result = 31 * result + Arrays.hashCode(getAlumnos());
        return result;
    }
}
