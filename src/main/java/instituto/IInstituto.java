package instituto;

import instituto.exceptions.NoHayGrupoException;

public interface IInstituto {
    void printInfo();

    void printAlumnosEnCp(int cp);

    Alumno[] findAlumnos(String name) throws NoHayGrupoException;
}
