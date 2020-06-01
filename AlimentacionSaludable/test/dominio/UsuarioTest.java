package dominio;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    
    @Test
    public void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsNullNombre() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNombre(), "Nombre no ingresado");
    }

    @Test
    public void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }

    @Test
    public void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }

    @Test
    public void testGetsSetsNullNacionalidad() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNacionalidad(), "Nacionalidad no ingresada");
    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }
    
    @Test
    public void testSetPreferenciasVacias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        usuario.actualizarPreferenciasUsuario(usuario, new ArrayList<String>());
        assertEquals(usuario.getPreferencias().size(), 0);
    }
    
    @Test
    public void testSetRestriccionesVacias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        usuario.actualizarRestriccionesUsuario(usuario, new ArrayList<String>());
        assertEquals(usuario.getPreferencias().size(), 0);
    }
    
    @Test
    public void testSetPreferencias() {
        ArrayList<String> preferencias = new ArrayList<>();
        preferencias.add("Vegetales");
        Usuario usuario = new Usuario(null, null, null, null, null, preferencias, null, null);
        String[] resultado = new String[1];
        resultado[0] = "Vegetales";
        assertEquals(usuario.getArrayPreferencias(), resultado);
    }
    
    @Test
    public void testSetRestricciones() {
        ArrayList<String> restricciones = new ArrayList<>();
        restricciones.add("Lacteos");
        Usuario usuario = new Usuario(null, null, null, null, null, null, restricciones, null);
        String[] resultado = new String[1];
        resultado[0] = "Lacteos";
        assertEquals(usuario.getArrayRestricciones(), resultado);
    }
    
    @Test
    public void testSetAlimentosIngeridos() {
        ArrayList<Ingesta> ingestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Frutilla",null,null,null));
        ingestas.add(new Ingesta("12/05/2020", listaAlimentos));
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, ingestas);
        String[] resultado = new String[1];
        Ingesta i = new Ingesta("12/05/2020", listaAlimentos);
        resultado[0] = i.toString();
        assertEquals(usuario.getArrayAlimentosIngeridos(), resultado);
    }
    
    @Test
    public void testToString() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.toString(), "Nombre no ingresado");
    }

}
