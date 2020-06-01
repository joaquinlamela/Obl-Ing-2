package dominio;

import javax.swing.ImageIcon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public final class ProfesionalTest {

    

    @Test
    public void testGetsSetsDatosVacioGraduacion() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFechaGraduacion(), "Fecha no ingresada");
    }
    
    @Test
    public void testGetsSetsDatosNullGraduacion() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = null;
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFechaGraduacion(), "Fecha no ingresada");
    }
    
    @Test
    public void testGetsSetsDatosCorrectosGraduacion() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFechaGraduacion(), fechaGrad);
    }

    @Test
    public void testGetsDatosCorrectosPais() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "" + Sistema.Paises.Uruguay;
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getPaisGraduacion(), paisGraduacion);
    }
    
    @Test
    public void testGetsDatosVaciosPais() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getPaisGraduacion(), "Pais no especificado");
    }
    
    @Test
    public void testGetsDatosNullPais() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = null;
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getPaisGraduacion(), "Pais no especificado");
    }

    @Test
    public void testGetsSetsDatosVacioTitulo() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getTituloProfesional(), "Titulo no declarado");
    }
    
    @Test
    public void testGetsSetsDatoNullTitulo() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = null;
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getTituloProfesional(), "Titulo no declarado");
    }
    
    @Test
    public void testGetsSetsDatosCorrectosTitulo() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getTituloProfesional(), tituloProf);
    }
    
    @Test
    public void testSetsGetsDatosCorrectosImagenes() {
        ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"));
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = i;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFotoDePerfil(), i);
    }

    @Test
    public void testToStringDatosCorrectos() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = nombre + " " + apellido;
        assertEquals(prof.toString(), toStringEperado);
    }

    @Test
    public void testToStringDatosNull() {
        String nombre = null;
        String apellido = null;
        String fechaNacimiento = null;
        ImageIcon fotoPerfil = null;
        String tituloProf = null;
        String fechaGrad = null;
        String paisGraduacion = null;
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }

    @Test
    public void testToStringNombreVacio() {
        String nombre = "";
        String apellido = "Rodriguez";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Rodriguez";
        assertEquals(prof.toString(), toStringEperado);
    }
    
    @Test
    public void testToStringApellidoVacio() {
        String nombre = "Juan";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Juan";
        assertEquals(prof.toString(), toStringEperado);
    }
    
    @Test
    public void testToStringDatosVacios() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }
}
