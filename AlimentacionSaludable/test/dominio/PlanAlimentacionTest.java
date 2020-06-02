package dominio;

import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanAlimentacionTest {

    private static final String MANZANA = "Manzana"; 
    private static final String PLAN_DE_ALIMENTACION = "Plan de alimentación";
    private static final String PLAN_DE_2_DIAS_DOWN= "Plan 2 Dias DOWN";
    private static final String GOMEZ= "Gómez";
    private static final String IMAGEN= "Imagenes/fotoDeUsuarioStandard.png";
    private static final String MARTIN= "Martin";
    private static final String URUGUAYO= "Uruguayo";
    private static final String FECHA= "11/02/98";
    private static final String ALEJANDRO= "Alejandro"; 
    private static final String FERNANDEZ="Fernandez";
    private static final String PLAN_DE_2_DIAS= "Plan 2 Dias"; 
    
    @Test
    public void testGetsSetsNullToString() {
        String nombrePlan = null;
        Usuario usuario = null;
        Profesional profesional = null;
        boolean fueAtendido = false;
        String[][] planDiaADia = null;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), PLAN_DE_ALIMENTACION);
    }

    @Test
    public void testGetsSetsDatosVaciosNombre() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), PLAN_DE_ALIMENTACION);
    }

    @Test
    public void testGetsSetsDatosVaciosUsuario() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("", "", null, null, null, null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosProfesional() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("", "", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosFueAtendido() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosVaciosPlanDiaADia() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String[][] planEsperado = new String[0][0];
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosToString() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), PLAN_DE_ALIMENTACION);
    }

    @Test
    public void testGetsSetsDatosCorrectosNombre() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), nombrePlan);
    }

    @Test
    public void testGetsSetsDatosCorrectosProfesional() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosFueAtendido() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosCorrectosUsuario() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosPlanDiaADia() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planDiaADia);
    }

    @Test
    public void testGetsSetsDatosCorrectosToString() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), nombrePlan);
    }

    @Test
    public void testEqualsIguales() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear, planAComparar);
    }

    @Test
    public void testEqualsDiferentesNombre() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS_DOWN;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String nombrePlan2 = "Plan 2 Dias UP";
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuario, profesional,
                fueAtendido, planDiaADia);
        assertNotEquals(planATestear, planAComparar);
    }
    
    @Test
    public void testEqualsDiferentesUsuario() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Usuario usuarioComparacion = new Usuario("Joaquin", GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String nombrePlan2 = PLAN_DE_2_DIAS;
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuarioComparacion, profesional,
                fueAtendido, planDiaADia);
        assertNotEquals(planATestear, planAComparar);
    }
    
    @Test
    public void testEqualsDiferentesProfesional() {
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = MANZANA;
        planDiaADia[0][1] = MANZANA;
        planDiaADia[1][0] = MANZANA;
        planDiaADia[1][1] = MANZANA;
        String nombrePlan = PLAN_DE_2_DIAS;
        Usuario usuario = new Usuario(MARTIN, GOMEZ, FECHA, new ImageIcon(IMAGEN), URUGUAYO, null, null, null);
        Profesional profesional = new Profesional(ALEJANDRO, FERNANDEZ, null, null, null, null, null);
        Profesional profesionalComparacion = new Profesional("Diego", FERNANDEZ, null, null, null, null, null);
        boolean fueAtendido = true;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String nombrePlan2 = PLAN_DE_2_DIAS;
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuario, profesionalComparacion,
                fueAtendido, planDiaADia);
        assertNotEquals(planATestear, planAComparar);
    }
}
