package instituto;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String apellidos;
    private int cp;

    public Alumno(String nombre, String apellidos, int cp) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cp = cp;
    }

    public void printInfo() {
        System.out.println(nombre + " " + apellidos + ", con domicilio en código postal " + cp);
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCp() {
        return cp;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return getCp() == alumno.getCp() && Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getApellidos(), alumno.getApellidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellidos(), getCp());
    }
}
