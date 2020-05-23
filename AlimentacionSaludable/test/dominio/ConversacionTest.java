package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversacionTest {

    public ConversacionTest() {
    }

    @Test
    public void testAgregarMensajeSinIntercambio() {
        Usuario u = new Usuario("Juan", "Perez", null, null, null, null, null, null);
        Profesional p = new Profesional("Diego", "Rodriguez", null, null, null, null, null);
        Conversacion c = new Conversacion(u, p, new ArrayList<InformacionMensaje>());
        InformacionMensaje i = new InformacionMensaje(u.getNombreCompleto(), p.getNombreCompleto(), "Hola");
        boolean agregado = c.agregarMensaje("Hola", false);
        ArrayList<InformacionMensaje> listaMensajes = new ArrayList<>();
        listaMensajes.add(i);
        assertEquals(agregado, true);
        assertEquals(c.getListaMensajes().get(0).getMensaje(), listaMensajes.get(0).getMensaje());
        assertEquals(c.getListaMensajes().get(0).getDestinatario(), listaMensajes.get(0).getDestinatario());
        assertEquals(c.getListaMensajes().get(0).getRemitente(), listaMensajes.get(0).getRemitente());
    }
    
    @Test
    public void testAgregarMensajeConIntercambio() {
        Usuario u = new Usuario("Juan", "Perez", null, null, null, null, null, null);
        Profesional p = new Profesional("Diego", "Rodriguez", null, null, null, null, null);
        Conversacion c = new Conversacion(u, p, new ArrayList<InformacionMensaje>());
        InformacionMensaje i = new InformacionMensaje(p.getNombreCompleto(), u.getNombreCompleto(), "Hola");
        boolean agregado = c.agregarMensaje("Hola", true);
        ArrayList<InformacionMensaje> listaMensajes = new ArrayList<>();
        listaMensajes.add(i);
        assertEquals(agregado, true);
        assertEquals(c.getListaMensajes().get(0).getMensaje(), listaMensajes.get(0).getMensaje());
        assertEquals(c.getListaMensajes().get(0).getDestinatario(), listaMensajes.get(0).getDestinatario());
        assertEquals(c.getListaMensajes().get(0).getRemitente(), listaMensajes.get(0).getRemitente());
    }
    
    @Test
    public void testGetSetsNullUsuario() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetSetsNullProfesional() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    
     @Test
    public void testSetListaMensaje() {
        Usuario u = new Usuario("Juan", "Perez", null, null, null, null, null, null);
        Profesional p = new Profesional("Diego", "Rodriguez", null, null, null, null, null);
        Conversacion c = new Conversacion(u, p, new ArrayList<InformacionMensaje>());
        InformacionMensaje i = new InformacionMensaje(u.getNombreCompleto(), p.getNombreCompleto(), "Hola");
        ArrayList<InformacionMensaje> listaMensajes = new ArrayList<>();
        listaMensajes.add(i);
        c.setListaMensajes(listaMensajes);
        assertEquals(c.getListaMensajes().get(0).getMensaje(), listaMensajes.get(0).getMensaje());
        assertEquals(c.getListaMensajes().get(0).getDestinatario(), listaMensajes.get(0).getDestinatario());
        assertEquals(c.getListaMensajes().get(0).getRemitente(), listaMensajes.get(0).getRemitente());
    }
    
    @Test
    public void testGetSetsNullLsitaMensajes() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetSetsVaciaLsitaMensajes() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList<InformacionMensaje> listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes(), listaMensajes);
    }
    
    @Test
    public void testGetSetsNullToString() {
        Persona usuario = null;
        Persona profesional = null;
        ArrayList listaMensajes = null;
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }


    @Test
    public void testGetSetsDatosVaciosProfesional() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        Persona profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(conversacionATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetSetsDatosVaciosListaMensajes() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.getListaMensajes().size(), 0);
    }

    @Test
    public void testGetConsulta() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        conversacionATestear.setFueAtendidaConsulta(true);
        assertTrue(conversacionATestear.getFueAtendidaConsulta());
    }
    
    @Test
    public void testEqualsProfesionalesDistintos() {
        Persona usuario = new Usuario("Juan", null, null, null, null, null, null, null);
        Persona profesionalComparacion = new Usuario("Jose", null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacion1 = new Conversacion(usuario, profesional, listaMensajes);
        Conversacion conversacion2 = new Conversacion(usuario, profesionalComparacion, listaMensajes);
        assertFalse(conversacion1.equals(conversacion2));
    }
    
    @Test
    public void testEqualsUsuariosDistintos() {
        Persona usuario = new Usuario("Juan", null, null, null, null, null, null, null);
        Persona usuarioComparacion = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacion1 = new Conversacion(usuario, profesional, listaMensajes);
        Conversacion conversacion2 = new Conversacion(usuarioComparacion, profesional, listaMensajes);
        assertFalse(conversacion1.equals(conversacion2));
    }
    
    @Test
    public void testEqualsIguales() {
        Persona usuario = new Usuario("Juan", null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacion1 = new Conversacion(usuario, profesional, listaMensajes);
        Conversacion conversacion2 = new Conversacion(usuario, profesional, listaMensajes);
        assertTrue(conversacion1.equals(conversacion2));
    }
    
    @Test
    public void testToString() {
        Persona usuario = new Usuario(null, null, null, null, null, null, null, null);
        Persona profesional = new Profesional(null, null, null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        assertEquals(conversacionATestear.toString(), "No hay mensajes para mostrar");
    }
    
    @Test
    public void testGetSetsDatosVaciosToString() {
        Usuario usuario = new Usuario("Juan", "Perez", null, null, null, null, null, null);
        Profesional profesional = new Profesional("Diego", "Rodriguez", null, null, null, null, null);
        ArrayList listaMensajes = new ArrayList<>();
        InformacionMensaje i = new InformacionMensaje(usuario.getNombreCompleto(), profesional.getNombreCompleto(), "Hola");
        listaMensajes.add(i);
        Conversacion conversacionATestear = new Conversacion(usuario, profesional, listaMensajes);
        String resultado = conversacionATestear.toString();
        String esperado = "\nJuan Perez\nHola\n";
        assertEquals(esperado, resultado);
    }
}
