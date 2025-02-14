/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import dominio.Sistema.Paises;
import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author PC
 */
public class EnumTest {
    
    @Test
    public void testEnumValuePreferencias() {
        for (Sistema.Preferencias valores : Sistema.Preferencias.values()) {
            Assert.assertNotNull(Sistema.Preferencias.valueOf("" + valores));
        }
    }
    
    @Test
    public void testEnumPreferenciasCarnesRojas() {
        String resultadoEsperado = "CarnesRojas";
        assertEquals(Sistema.Preferencias.CarnesRojas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasVerduras() {
        String resultadoEsperado = "Verduras";
        assertEquals(Sistema.Preferencias.Verduras.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasFrutas() {
        String resultadoEsperado = "Frutas";
        assertEquals(Sistema.Preferencias.Frutas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasHarinas() {
        String resultadoEsperado = "Harinas";
        assertEquals(Sistema.Preferencias.Harinas.name(), resultadoEsperado);
    }

    @Test
    public void testEnumPreferenciasCarnesBlancas() {
        String resultadoEsperado = "CarnesBlancas";
        assertEquals(Sistema.Preferencias.CarnesBlancas.name(), resultadoEsperado);
    }
    
    @Test
    public void testEnumValueRestricciones() {
        for (Sistema.Restricciones valores : Sistema.Restricciones.values()) {
            Assert.assertNotNull(Sistema.Restricciones.valueOf("" + valores));
        }
    }
    
    @Test
    public void testEnumRestriccionesDiabetes() {
        String resultadoEsperado = "Diabetes";
        assertEquals(Sistema.Restricciones.Diabetes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesVeganismo() {
        String resultadoEsperado = "Veganismo";
        assertEquals(Sistema.Restricciones.Veganismo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesIntoleranciaLactosa() {
        String resultadoEsperado = "IntoleranciaLactosa";
        assertEquals(Sistema.Restricciones.IntoleranciaLactosa.name(), resultadoEsperado);
    }

    @Test
    public void testEnumRestriccionesHarinas() {
        String resultadoEsperado = "Celiaquia";
        assertEquals(Sistema.Restricciones.Celiaquia.name(), resultadoEsperado);
    }
    
    @Test
    public void testEnumValueDiasDeLaSemana() {
        for (Sistema.DiasDeLaSemana valores : Sistema.DiasDeLaSemana.values()) {
            Assert.assertNotNull(Sistema.DiasDeLaSemana.valueOf("" + valores));
        }
    }

    @Test
    public void testEnumDevolverListaDiasDeLaSemana() {
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Lunes");
        listaEsperada.add("Martes");
        listaEsperada.add("Miercoles");
        listaEsperada.add("Jueves");
        listaEsperada.add("Viernes");
        listaEsperada.add("Sabado");
        listaEsperada.add("Domingo");
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.devolverListaDiasDeLaSemana(), listaEsperada);
    }
    
    @Test
    public void testEnumDiasSemanaJueves() {
        String resultadoEsperado = "Jueves";
        assertEquals(Sistema.DiasDeLaSemana.Jueves.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaViernes() {
        String resultadoEsperado = "Viernes";
        assertEquals(Sistema.DiasDeLaSemana.Viernes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaSabado() {
        String resultadoEsperado = "Sabado";
        assertEquals(Sistema.DiasDeLaSemana.Sabado.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaDomingo() {
        String resultadoEsperado = "Domingo";
        assertEquals(Sistema.DiasDeLaSemana.Domingo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMiercoles() {
        String resultadoEsperado = "Miercoles";
        assertEquals(Sistema.DiasDeLaSemana.Miercoles.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaMartes() {
        String resultadoEsperado = "Martes";
        assertEquals(Sistema.DiasDeLaSemana.Martes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDiasSemanaLunes() {
        String resultadoEsperado = "Lunes";
        assertEquals(Sistema.DiasDeLaSemana.Lunes.name(), resultadoEsperado);
    }

    @Test
    public void testEnumValueIngestasDiaDesayuno() {
        for (Sistema.IngestasPorDia valores : Sistema.IngestasPorDia.values()) {
            Assert.assertNotNull(Sistema.IngestasPorDia.valueOf("" + valores));
        }
    }
    
    @Test
    public void testEnumIngestasDiaDesayuno() {
        String resultadoEsperado = "Desayuno";
        assertEquals(Sistema.IngestasPorDia.Desayuno.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaAlmuerzo() {
        String resultadoEsperado = "Almuerzo";
        assertEquals(Sistema.IngestasPorDia.Almuerzo.name(), resultadoEsperado);
    }

    @Test
    public void testEnumIngestasDiaCena() {
        String resultadoEsperado = "Cena";
        assertEquals(Sistema.IngestasPorDia.Cena.name(), resultadoEsperado);
    }

    @Test
    public void testEnumDevolverListaIngestas() {
        ArrayList<String> listaEsperada = new ArrayList<>();
        listaEsperada.add("Desayuno");
        listaEsperada.add("Almuerzo");
        listaEsperada.add("Cena");
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.devolverListaIngestasDeLaSemana(), listaEsperada);
    }

    @Test
    public void testEnumValuePaises() {
        for (Sistema.Paises valores : Sistema.Paises.values()) {
            Assert.assertNotNull(Sistema.Paises.valueOf("" + valores));
        }
    }
    
    @Test
    public void testEnumListaPaises() {
        ArrayList<String> lstNacionalidades = new ArrayList<>();
        lstNacionalidades.add(Paises.Argentina.toString());
        lstNacionalidades.add(Paises.Bolivia.toString());
        lstNacionalidades.add(Paises.Brasil.toString());
        lstNacionalidades.add(Paises.Chile.toString());
        lstNacionalidades.add(Paises.Colombia.toString());
        lstNacionalidades.add("Costa Rica");
        lstNacionalidades.add(Paises.Cuba.toString());
        lstNacionalidades.add(Paises.Ecuador.toString());
        lstNacionalidades.add("El Salvador");
        lstNacionalidades.add("Guayana Francesa");
        lstNacionalidades.add(Paises.Granada.toString());
        lstNacionalidades.add(Paises.Guatemala.toString());
        lstNacionalidades.add(Paises.Guayana.toString());
        lstNacionalidades.add(Paises.Haití.toString());
        lstNacionalidades.add(Paises.Honduras.toString());
        lstNacionalidades.add(Paises.Jamaica.toString());
        lstNacionalidades.add(Paises.Mexico.toString());
        lstNacionalidades.add(Paises.Nicaragua.toString());
        lstNacionalidades.add(Paises.Paraguay.toString());
        lstNacionalidades.add(Paises.Panama.toString());
        lstNacionalidades.add(Paises.Peru.toString());
        lstNacionalidades.add("Puerto Rico");
        lstNacionalidades.add("República Dominicana");
        lstNacionalidades.add(Paises.Surinam.toString());
        lstNacionalidades.add(Paises.Uruguay.toString());
        lstNacionalidades.add(Paises.Venezuela.toString());
        Sistema sistemaATestear = new Sistema();
        assertEquals(sistemaATestear.devolverListaPaises(), lstNacionalidades);
    }
    
}
