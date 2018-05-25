import Stock.Guitar;
import Stock.Instrument;
import Stock.Stock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StockTest {

    Stock item;


    @Before
    public void before(){
        item = new Guitar(300, 150, "Fender", "Strat", "Five Stars");
    }

    @Test
    public void canGetRrp(){
        assertEquals(300, item.getRrp(), 0.01);
    }

    @Test
    public void canGetBuyIn(){
        assertEquals(150, item.getBuyIn(), 0.01);
    }


    }
