package dominio;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngestaTest {

    public IngestaTest() {

    }
    
    @Test
    public void testGetsSetsFechaVaciaListaAlimentos() {
        String fechaDeIngesta = "";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        assertEquals(ingestaATestear.getFechaDeIngesta(), "Fecha de ingesta no registrada");
    }
    
    @Test
    public void testGetsSetsFechaNullListaAlimentos() {
        String fechaDeIngesta = null;
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        assertEquals(ingestaATestear.getFechaDeIngesta(), "Fecha de ingesta no registrada");
    }
    
    @Test
    public void testGetsSetsDatosValidosListaAlimentos() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        assertEquals(ingestaATestear.getListaAlimentosPorFecha(), listaAlimentosPorFecha);
    }

    @Test
    public void testListaAlimentosVaciaToString() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        String toStringEsperado = "No hay alimentos ingeridos";
        assertEquals(ingestaATestear.toString(), toStringEsperado);
    }
    
    @Test
    public void testGetsSetsDatosValidosToString() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        String toStringEsperado = "Lista de alimentos ingeridos" + listaAlimentosPorFecha;
        assertEquals(ingestaATestear.toString(), toStringEsperado);
    }

    @Test
    public void testEqualsIguales() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertTrue(resultadoEquals);
    }

    @Test
    public void testEqualsDistintosFecha() {
        String fechaDeIngesta = "11/02/17";
        String fechaDeIngestaComparacion = "12/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngestaComparacion, listaAlimentosPorFecha);
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertFalse(resultadoEquals);
    }
    
    @Test
    public void testEqualsDistintosListaAlimentos() {
        String fechaDeIngesta = "11/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngesta, new ArrayList<>());
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertFalse(resultadoEquals);
    }
    
    @Test
    public void testEqualsDistintosAmbos() {
        String fechaDeIngesta = "11/02/17";
        String fechaDeIngestaComparacion = "12/02/17";
        ArrayList<ComposicionAlimento> listaComposicion = new ArrayList<>();
        listaComposicion.add(new ComposicionAlimento("Lipidos", 2));
        Alimento alimento1 = new Alimento("Papa", "Verdura", listaComposicion, null);
        ArrayList<Alimento> listaAlimentosPorFecha = new ArrayList<>();
        listaAlimentosPorFecha.add(alimento1);
        Ingesta ingestaATestear = new Ingesta(fechaDeIngesta, listaAlimentosPorFecha);
        Ingesta ingestaAComparar = new Ingesta(fechaDeIngestaComparacion, new ArrayList<>());
        boolean resultadoEquals = ingestaATestear.equals(ingestaAComparar);
        assertFalse(resultadoEquals);
    }
}
