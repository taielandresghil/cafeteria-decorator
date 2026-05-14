package ar.edu.unahur.obj2.decorator.infusiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.decorator.decoradores.Canela;
import ar.edu.unahur.obj2.decorator.decoradores.Leche;
import ar.edu.unahur.obj2.decorator.exepciones.InfusionNulaException;

public class CafeteriaTest {

    @Test
    void cafeConLecheSale4() {
        //Al crear una infusion la base debe ir ultima ya que es la que queremos decorar.
        //Seria: Leche(Cafe) o por ejemplo Canela(Leche(Cafe))
        IInfusion cafeConLeche = new Leche(new Cafe());
        assertEquals(4, cafeConLeche.getCostoBase());
    }

    @Test
    void cafeConLecheSeMuestraComoCafe_Con_Leche() {
        IInfusion cafeConLeche2 = new Leche(new Cafe());
        assertEquals("Cafe con Leche", cafeConLeche2.getNombre());
    }

    @Test 
    void cafeConLecheConCanelaSeMuestraComoCafe_Con_Leche_Con_Canela() {
        IInfusion cafeConLecheConCanela = new Canela(new Leche(new Cafe()));
        assertEquals("Cafe con Leche con Canela", cafeConLecheConCanela.getNombre());
    }

    @Test 
    void lanzaExcepcionSiSeCreaUnaInfusionDecoradaConDecoradorNulo() {
        assertThrows(InfusionNulaException.class, 
        () -> new Leche(null)
        );
    }
}
