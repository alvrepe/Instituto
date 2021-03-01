import instituto.Alumno;
import instituto.Grupo;
import instituto.Instituto;
import instituto.exceptions.NoHayGrupoException;
import org.junit.Assert;
import org.junit.Test;

public class InstitutoTests {


    @Test
    public void finAlumnosTest() throws NoHayGrupoException {
        Alumno[] alumnos = {new Alumno("mike", "X", 2124)};
        Grupo[] grupos = {new Grupo("DAM", "A109", alumnos)};
        Instituto instituto = new Instituto("instituto", grupos);

        Alumno[] res = instituto.findAlumnos("DAM");

        Assert.assertArrayEquals(alumnos, res);

    }

    @Test(expected = NoHayGrupoException.class)
    public void finAlumnosNoExisteTest() throws NoHayGrupoException {
        Alumno[] alumnos = {new Alumno("mike", "X", 2124)};
        Grupo[] grupos = {new Grupo("DAM", "A109", alumnos)};
        Instituto instituto = new Instituto("instituto", grupos);

        Alumno[] res = instituto.findAlumnos("EMR");


    }


}
