package dominio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {

    public SistemaTest() {

    }


    @Test
    public void testGetsSetsNullListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaPlanes() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaPlanesAlimentacion().size(), 0);
    }

    @Test
    public void testGetsSetsNullListaConversaciones() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaConversaciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPersonaLogueada() {
        ArrayList<Usuario> listaUsuarios = null;
        ArrayList<Profesional> listaProfesionales = null;
        ArrayList<Alimento> listaAlimentos = null;
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = null;
        ArrayList<Conversacion> listaConversaciones = null;
        Persona personaLogueada = null;
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona personaLogueadaEsperada = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getPersonaLogueada(), personaLogueadaEsperada);
    }

    @Test
    public void testGetsSetsDatosVaciosListaUsuarios() {
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.getListaUsuarios().size(), 0);
    }

    @Test
    public void testGetsSetsDatosVaciosListaAlimentos() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        Persona personaLogueada = new Usuario(null, null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        assertEquals(sistemaATestear.getListaAlimentos().size(), 0);
    }

    @Test
    public void testAgregarMensajeConversacionListaVacia() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion("Martin", "Lucia", "aa", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testAgregarMensajeConversacionNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        boolean pudeAgregarMensaje = sistemaATestear.agregarMensajeConversacion(null, null, "Segundo mensaje", false, false);
        assertFalse(pudeAgregarMensaje);
    }

    @Test
    public void testDevolverAlimentoNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento(null, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(null), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Alimento alimentoEsperado = new Alimento("", "", null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre(""), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosCorrectos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertEquals(sistemaATestear.devolverAlimentoDadoNombre("Papa"), alimentoEsperado);
    }

    @Test
    public void testDevolverAlimentoDatosErroneos() {
        ArrayList listaAlimentos = new ArrayList<>();
        Alimento alimentoEsperado = new Alimento("Papa", "Verdura", null, null);
        listaAlimentos.add(alimentoEsperado);
        Sistema sistemaATestear = new Sistema(null, null, listaAlimentos, null, null, null);
        assertNotEquals(sistemaATestear.devolverAlimentoDadoNombre("Luca"), alimentoEsperado);
    }

    @Test
    public void testUsuarioDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertNotEquals(sistemaATestear.getProfesionalPorNombre(null), usuarioEsperado);
    }

    @Test
    public void testProfesionalDevolverPorNombreNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(null), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre(""), profesionalEsperado);
    }

    @Test
    public void testDevolverProfesionalPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional profesionalEsperado = new Profesional("Martin", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(profesionalEsperado);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), profesionalEsperado);
    }

    @Test
    public void testDevolverUsuarioPorNombreDatosVacios() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuarioEsperado = new Usuario(null, null, null, null, null, null, null, null);
        assertNotEquals(sistemaATestear.getProfesionalPorNombre(""), usuarioEsperado);
    }

    @Test
    public void testUsuarioAAgregarNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = null;
        assertFalse(sistemaATestear.agregarUsuarioALaLista(usuario));
    }
    
    @Test
    public void testUsuarioRepetido() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        assertFalse(sistemaATestear.agregarUsuarioALaLista(usuario));
    }
    
    @Test
    public void testDevolverUsuarioPorNombre() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        assertEquals(sistemaATestear.getUsuarioPorNombre("Martin"), usuario);
    }
    
    @Test
    public void testDevolverUsuarioPorNombreDatosErroneos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista(usuario);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Martin"), profesional);
    }

    @Test
    public void testCrearProfesional() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearProfesional("Juan", "Perez", null, null, null, null, null);
        sistemaATestear.crearProfesional("Jose", "Rodriguez", null, null, null, null, null);
        Profesional p1 = new Profesional("Juan", "Perez", null, null, null, null, null);
        Profesional p2 = new Profesional("Jose", "Rodriguez", null, null, null, null, null);
        
        assertEquals(sistemaATestear.getProfesionalPorNombre("Juan Perez"), p1);
        assertEquals(sistemaATestear.getProfesionalPorNombre("Jose Rodriguez"), p2);
    }
    
    @Test
    public void testAgregarProfesional() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Profesional p1 = new Profesional("Juan", "Perez", null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista(p1);
        assertFalse(sistemaATestear.agregarProfesionalALaLista(p1));
        assertFalse(sistemaATestear.agregarProfesionalALaLista(null));
        assertEquals(sistemaATestear.getProfesionalPorNombre("Juan Perez"), p1);
    }
    
    @Test
    public void testCrearAlimento() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearAlimento("Frutilla", null, null, null);
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        Alimento a = new Alimento("Frutilla", null, null, null);
        listaAlimentos.add(a);
        assertEquals(sistemaATestear.getListaAlimentos(), listaAlimentos);
    }
    
    @Test
    public void testAgregarAlimento() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearAlimento("Frutilla", null, null, null);
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        Alimento a = new Alimento("Frutilla", null, null, null);
        listaAlimentos.add(a);
        sistemaATestear.agregarAlimentoALaLista(a);
        assertEquals(sistemaATestear.getListaAlimentos(), listaAlimentos);
        assertFalse(sistemaATestear.agregarAlimentoALaLista(a));
        assertFalse(sistemaATestear.agregarAlimentoALaLista(null));
    }
    
    @Test
    public void testAgregarPlanAlimentacionUsuarioNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = null;
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionProfesionalNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = null;
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testAgregarPlanAlimentacionRepetidos() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional1 = new Profesional(null, null, null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertFalse(sistemaATestear.agregarPlanSolicitado(usuario1, profesional1));
    }

    @Test
    public void testPlanesPendientes() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional1).length, 1);
    }

    @Test
    public void testPlanesPendientes2() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        Profesional profesional2 = new Profesional("Joaquin", "Bardanca", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(profesional2).length, 0);
    }

    @Test
    public void testPlanesPendientesNull() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        Usuario usuario1 = new Usuario("Martin", "Gómez", null, null, null, null, null, null);
        Profesional profesional1 = new Profesional("Sandra", "Pazos", null, null, null, null, null);
        sistemaATestear.agregarPlanSolicitado(usuario1, profesional1);
        assertEquals(sistemaATestear.getListaPlanesPendientes(null).length, 0);
    }

    @Test
    public void testAgregarAListaConversacionesDatoUsuarioNull() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = null;
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatoProfesionalNull() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Persona profesionalConversacion = null;
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatoMensajeVacio1() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatoMensajeVacio2() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = null;
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatoMensajeVacio3() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Persona profesionalConversacion = null;
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatoMensajeVacio4() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = null;
        Persona profesionalConversacion = null;
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesDatoMensajeVacio5() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = null;
        Persona profesionalConversacion = null;
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testAgregarAListaConversacionesProfesionalNoAgregado() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        boolean agregoConversacionRepetida = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacionRepetida);
    }
    
    @Test
    public void testAgregarAListaConversacionesUsuarioNoAgregado() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertFalse(agregoConversacion);
    }

    @Test
    public void testAgregarAListaConversacionesSinIntecambio() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        assertTrue(agregoConversacion);
        assertEquals(sistemaATestear.getListaConversaciones().get(0).getListaMensajes().get(0).getRemitente(),usuarioConversacion.toString());
        assertEquals(sistemaATestear.getListaConversaciones().get(0).getListaMensajes().get(0).getDestinatario(),profesionalConversacion.toString());
    }
    
    @Test
    public void testAgregarAListaConversacionesConIntecambio() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", false);
        assertTrue(agregoConversacion);
        assertEquals(sistemaATestear.getListaConversaciones().get(0).getListaMensajes().get(0).getRemitente(),profesionalConversacion.toString());
        assertEquals(sistemaATestear.getListaConversaciones().get(0).getListaMensajes().get(0).getDestinatario(),usuarioConversacion.toString());
    }
    
    @Test
    public void testAgregarAListaConversacionRepetida() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", false);
        boolean agregoConversacion = sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", false);
        assertFalse(agregoConversacion);
    }
    
    @Test
    public void testGetListaNombresProfesionalesConversaciones() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        
        String[] nombres = {"Luis"};
        assertEquals(sistemaATestear.getListaNombresProfesionalesConversaciones("Martin"),nombres);
    }
    
    @Test
    public void testGetListaNombres2ProfesionalesConversaciones1() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        
        String[] nombres = {"Luis","Pedro"};
        assertEquals(sistemaATestear.getListaNombresProfesionalesConversaciones("Martin"),nombres);
    }
    
    @Test
    public void testGetListaNombres2ProfesionalesConversaciones2() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        
        String[] resultado = sistemaATestear.getListaNombresProfesionalesConversaciones("Martin");
        String[] nombres = {"Luis","Pedro"};
        for (int i = 0; i < nombres.length; i++) {
            assertEquals(resultado[i],nombres[i]);
        }
    }
    
    @Test
    public void testGetListaNombres2ProfesionalesConversaciones3() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola 2.0", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion3, "Me Alegro", true);
         
        String[] resultado = sistemaATestear.getListaNombresProfesionalesConversaciones("Martin");
        String[] nombres = {"Luis","Pedro"};
        for (int i = 0; i < nombres.length; i++) {
            assertEquals(resultado[i],nombres[i]);
        }
    }
    
    @Test
    public void testGetListaNombresUsuariosConversacionesPendientes() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        Persona usuarioConversacion3 = new Usuario("Jose", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion3);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola 2.0", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion3, profesionalConversacion3, "Me Alegro", true);
         
        String[] resultado = sistemaATestear.getListaNombresUsuariosConversacionesPendientes("Pedro");
        String[] nombres = {"Martin","Juan"};
        for (int i = 0; i < nombres.length; i++) {
            assertEquals(resultado[i],nombres[i]);
        }
    }
    
    @Test
    public void testGetConversacion() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        Persona usuarioConversacion3 = new Usuario("Jose", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion3);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola 2.0", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion3, profesionalConversacion3, "Me Alegro", true);
        
        assertEquals(sistemaATestear.getConversacion("Pedro", "Juan"),"\nJuan\nMuy bien\n");
        assertEquals(sistemaATestear.getConversacion("Luis", "Martin"),"\nMartin\nHola\n");
        assertEquals(sistemaATestear.getConversacion("Ricardo", "Martin"),"No hay conversación disponible.");   
    }
    
    @Test
    public void testGetAgregarMensajeConversacion() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        Persona usuarioConversacion3 = new Usuario("Jose", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion3);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion3, profesionalConversacion3, "Me Alegro", true);
        boolean fail = sistemaATestear.agregarMensajeConversacion("", null, "Hola 2.0", false,false);
        boolean ok = sistemaATestear.agregarMensajeConversacion("Martin", "Luis", "Hola 2.0", false,false);
        
        assertTrue(ok);
        assertFalse(fail);
        assertEquals(sistemaATestear.getConversacion("Luis", "Martin"),"\nMartin\nHola\n\nMartin\nHola 2.0\n");
    }
    
    @Test
    public void testGetAgregarMensajeConversacionSinIntercambio() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        Persona usuarioConversacion3 = new Usuario("Jose", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion3);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion3, profesionalConversacion3, "Me Alegro", true);
        boolean fail = sistemaATestear.agregarMensajeConversacion("", null, "Hola 2.0", false,false);
        boolean ok = sistemaATestear.agregarMensajeConversacion("Luis", "Martin", "Hola 2.0", false,false);
        
        assertTrue(ok);
        assertFalse(fail);
        assertEquals(sistemaATestear.getConversacion("Luis", "Martin"),"\nMartin\nHola\n\nMartin\nHola 2.0\n");
    }
    
    @Test
    public void testGetAgregarMensajeConversacionConIntercambio() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        Persona usuarioConversacion3 = new Usuario("Jose", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion3);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion3, profesionalConversacion3, "Me Alegro", true);
        boolean fail = sistemaATestear.agregarMensajeConversacion("", null, "Hola 2.0", false,false);
        boolean ok = sistemaATestear.agregarMensajeConversacion("Luis", "Martin", "Hola 2.0", true,false);
        
        assertTrue(ok);
        assertFalse(fail);
        assertEquals(sistemaATestear.getConversacion("Luis", "Martin"),"\nMartin\nHola\n\nLuis\nHola 2.0\n");
    }
    
    @Test
    public void testGetNombresProfesionalesSinConversacion() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Profesional> listaProfesionales = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        ArrayList<Conversacion> listaConversaciones = new ArrayList<>();
        
        Persona personaLogueada = new Usuario("Martin", null, null, null, null, null, null, null);
        Sistema sistemaATestear = new Sistema(listaUsuarios, listaProfesionales, listaAlimentos, listaPlanesAlimentacion, listaConversaciones, personaLogueada);
        Persona usuarioConversacion = new Usuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion);
        Persona usuarioConversacion2 = new Usuario("Juan", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion2);
        Persona usuarioConversacion3 = new Usuario("Jose", null, null, null, null, null, null, null);
        sistemaATestear.agregarUsuarioALaLista((Usuario)usuarioConversacion3);
        
        Persona profesionalConversacion = new Profesional("Luis", null, null, null, null, null, null);
        Persona profesionalConversacion2 = new Profesional("Pedro", null, null, null, null, null, null);
        Persona profesionalConversacion3 = new Profesional("Ricardo", null, null, null, null, null, null);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion2);
        sistemaATestear.agregarProfesionalALaLista((Profesional)profesionalConversacion3);
        
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion, "Hola", true);
        sistemaATestear.crearConversacion(usuarioConversacion, profesionalConversacion2, "Como estas", true);
        sistemaATestear.crearConversacion(usuarioConversacion2, profesionalConversacion2, "Muy bien", true);
        sistemaATestear.crearConversacion(usuarioConversacion3, profesionalConversacion3, "Me Alegro", true);
        
        ArrayList<Profesional> retorno = new ArrayList<>();
        retorno.add((Profesional)profesionalConversacion3);
        assertEquals(sistemaATestear.getNombresProfesionalesSinConversacionConUsuario(usuarioConversacion),retorno);
    }
    
    @Test
    public void testAgregarIngestaDatosCorrectos1() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Ingesta ingesta1 = new Ingesta("11/02/17", null);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaDatosCorrectos2() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        Alimento papa = new Alimento("Papa",null,null,null);
        Alimento frutilla = new Alimento("Frutilla",null,null,null);
        ArrayList<Alimento> alimentos = new ArrayList<>();
        alimentos.add(frutilla);
        alimentos.add(papa);
        Ingesta ingesta1 = new Ingesta("11/02/17", alimentos);
        listaIngestas.add(ingesta1);
        
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.agregarAlimentoALaLista(frutilla);
        sistemaATestear.agregarAlimentoALaLista(papa);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/16", "Papa");
        assertTrue(retorno);
        assertEquals(sistemaATestear.getListaAlimentos(), alimentos);
    }
    
    @Test
    public void testAgregarIngestaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaRepetida() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta("11/02/17", listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, "11/02/17", "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/17", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testAgregarIngestaFechaNull() {
        ArrayList<Ingesta> listaIngestas = new ArrayList<>();
        ArrayList<Alimento> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(new Alimento("Papa", null, null, null));
        Ingesta ingesta1 = new Ingesta(null, listaAlimentos);
        listaIngestas.add(ingesta1);
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        sistemaATestear.agregarIngestaAUsuario(listaIngestas, null, "Papa");
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), null, "Papa");
        assertFalse(retorno);
    }

    @Test
    public void testAgregarIngestaAlimentoRepetidoFechaDistinta() {
        Sistema sistemaATestear = new Sistema(null, null, null, null, null, null);
        sistemaATestear.crearUsuario("Martin", null, null, null, null, null, null, null);
        Usuario user = (Usuario) sistemaATestear.getUsuarioPorNombre("Martin");
        boolean retorno = sistemaATestear.agregarIngestaAUsuario(user.getAlimentosIngeridos(), "11/02/16", "Papa");
        assertTrue(retorno);
    }

    @Test
    public void testDevolverPlanDadoNombreNull() {
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre(null), new PlanAlimentacion(null, null, null, false, null));
    }

    @Test
    public void testDevolverPlanDatosValidos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan"), plan1);
    }

    @Test
    public void testDevolverPlanNoPertenece() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.devolverPlanDadoNombre("Plan").getNombreDelPlan(), plan1.getNombreDelPlan());
    }

    @Test
    public void testAtenderSolicitudPlan() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertTrue(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanAtendidoTrue() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, true, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, "Plan de alimentación");
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanProfesionalDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        Profesional professional2 = new Profesional("Lautaro", null, null, null, null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional2,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanUsuarioDistinto() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        Usuario user2 = new Usuario("Martina", null, null, null, null, null, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user2, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testAtenderSolicitudPlanListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        boolean fueAtendido = sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        assertFalse(fueAtendido);
    }

    @Test
    public void testListaPlanesAtendidosDatosCorrectos() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        Profesional professional1 = new Profesional("Ana", null, null, null, null, null, null);
        PlanAlimentacion plan1 = new PlanAlimentacion("Plan de alimentación", user1, professional1, false, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        listaPlanesAlimentacion.add(plan1);
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        sistemaATestear.atenderSolicitudDelPlan(plan1.getPlanDiaADia(), professional1,
                user1, plan1.getNombreDelPlan());
        boolean sonIguales = sistemaATestear.planesAtendidosDelUsuario(user1)[0].equals(plan1.getNombreDelPlan());
        assertTrue(sonIguales);
    }

    @Test
    public void testListaPlanesAtendidosListaVacia() {
        Usuario user1 = new Usuario("Martin", null, null, null, null, null, null, null);
        ArrayList<PlanAlimentacion> listaPlanesAlimentacion = new ArrayList<>();
        Sistema sistemaATestear = new Sistema(null, null, null, listaPlanesAlimentacion, null, null);
        assertEquals(sistemaATestear.planesAtendidosDelUsuario(user1).length, 0);
    }
    
    @Test
    public void guardarDatos() {
        Sistema s = new Sistema();
        s.crearAlimento("frutilla", null, null, null);
        s.guardarDatosSistema();
        
        Sistema nuevo;
        try {
            try (FileInputStream f = new FileInputStream("Sistema.data")) {
                nuevo = (Sistema) new ObjectInputStream(new BufferedInputStream(f)).readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            nuevo = new Sistema();
        }
        assertEquals(s.getListaAlimentos(), nuevo.getListaAlimentos());
    }
}
