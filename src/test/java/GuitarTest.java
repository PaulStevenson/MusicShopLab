import Stock.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(300.00, 150.00, "Fender", "Strat", "Five Stars");
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


}
