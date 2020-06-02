package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public final class AlimentoTest {

    private static final String LIPIDOS= "Lipidos"; 
    private static final String VERDURA= "Verdura"; 
    private static final String NOMBRENOINGRESAD= "Nombre de alimento no ingresado"; 
    private static final String PAPA= "Papa"; 
    
    @Test
    public void testSetsGetsNullTipo() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals(alimentoTest.getTipoAlimento(), "No definido");
    }

    @Test
    public void testSetsGetsNullListaNutrientes() {
        Alimento alimentoTest = new Alimento(null, null, null, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion().size(), 0);
    }

    @Test
    public void testSetsGetsDatosCorrectosNombre() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento(LIPIDOS, 2));
        Alimento alimentoTest = new Alimento(PAPA, VERDURA, listaComposicion, null);
        assertEquals(alimentoTest.getNombre(), PAPA);
    }

    @Test
    public void testSetsGetsDatosCorrectosTipo() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento(LIPIDOS, 2));
        Alimento alimentoTest = new Alimento(PAPA, VERDURA, listaComposicion, null);
        assertEquals(alimentoTest.getTipoAlimento(), VERDURA);
    }

    @Test
    public void testSetsGetsDatosCorrectosNutrientes() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento(LIPIDOS, 2));
        Alimento alimentoTest = new Alimento(PAPA, VERDURA, listaComposicion, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion(), listaComposicion);
    }
    
    @Test
    public void testSetsGetsDatosCorrectosImagenes() {
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento(LIPIDOS, 2));
        ImageIcon i = new ImageIcon(getClass().getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        Alimento alimentoTest = new Alimento(PAPA, VERDURA, listaComposicion, i);
        assertEquals(i, alimentoTest.getFotoDelAlimento());
    }

    @Test
    public void testSetsGetsListaNutrientesDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getListaNutrientesConProporcion().size(), 0);
    }

    @Test
    public void testSetsGetsNombreDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getNombre(), NOMBRENOINGRESAD);
    }

    @Test
    public void testSetsGetsTipoDatosVacios() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getTipoAlimento(), "No definido");
    }

    @Test
    public void testToStringNullNombre() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.getNombre(), NOMBRENOINGRESAD);
    }

    @Test
    public void testToStringNull() {
        Alimento alimentoTest = new Alimento("", "", null, null);
        assertEquals(alimentoTest.toString(), NOMBRENOINGRESAD);
    }

    @Test
    public void testToStringDatosCorrectos() {
        Alimento alimentoTest = new Alimento(PAPA, "", null, null);
        assertEquals(alimentoTest.toString(), PAPA);
    }

    @Test
    public void testEqualsIguales() {
        Alimento alimentoTest = new Alimento(PAPA, "", null, null);
        Alimento alimentoTest2 = new Alimento(PAPA, "", null, null);
        assertEquals(alimentoTest, alimentoTest2);
    }

    @Test
    public void testEqualsDiferentes() {
        Alimento alimentoTest = new Alimento("Rabanito", "", null, null);
        Alimento alimentoTest2 = new Alimento(PAPA, "", null, null);
        boolean sonIguales = alimentoTest.equals(alimentoTest2);
        assertFalse(sonIguales);
    }

}
