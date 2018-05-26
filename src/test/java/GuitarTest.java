import Stock.Guitar;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static Enums.GuitarType.ELECTRIC;
import static Enums.InstrumentType.STRING;
import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(300.00, 150.00, STRING,"Fender", "Strat", "Five Stars", ELECTRIC);
    }

    @Test
    public void getRRP(){
        assertEquals(300.00, guitar.getRrp(), 0.01);
    }

    @Test
    public void getBuyIn(){
        assertEquals(150.00, guitar.getBuyIn(), 0.01);
    }

    @Test
    public void getMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("Strat", guitar.getModel());
    }

    @Test
    public void getDescription(){
        assertEquals("Five Stars", guitar.getDescription());
    }

    @Test
    public void getNumberofStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void instrumentMakesNoise(){
        assertEquals("Plink Plonk", guitar.instrumentGoes());
    }




}
