import Enums.GuitarType;
import Stock.Guitar;
import Stock.Instrument;
import Stock.Stock;
import org.junit.Before;
import org.junit.Test;

import static Enums.InstrumentType.STRING;
import static org.junit.Assert.assertEquals;

public class StockTest {

    Stock item;


    @Before
    public void before(){
        item = new Guitar(300.00, 150.00, STRING, "Fender", "Strat", "Five Stars", GuitarType.ELECTRIC);
    }

    @Test
    public void canGetRrp(){
        assertEquals(300.00, item.getRrp(), 0.01);
    }

    @Test
    public void canGetBuyIn(){
        assertEquals(150.00, item.getBuyIn(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(150.00, item.calulateMarkUp(), 0.01);
    }

}
