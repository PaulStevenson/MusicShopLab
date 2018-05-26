import Enums.AccessoryType;
import Enums.GuitarType;
import Stock.Accessory;
import Stock.Guitar;
import Stock.Instrument;
import Stock.Stock;
import org.junit.Before;
import org.junit.Test;

import static Enums.InstrumentType.STRING;
import static org.junit.Assert.assertEquals;

public class StockTest {

    Stock instrument;
    Stock accessory;


    @Before
    public void before(){
        instrument = new Guitar(300.00, 150.00, STRING, "Fender", "Strat", "Five Stars", GuitarType.ELECTRIC);
        accessory = new Accessory("Pick", AccessoryType.ACCESSORIES,3.00, 0.75);

    }

    @Test
    public void canGetRrp(){
        assertEquals(300.00, instrument.getRrp(), 0.01);
    }

    @Test
    public void canGetBuyIn(){
        assertEquals(150.00, instrument.getBuyIn(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(150.00, instrument.calulateMarkUp(), 0.01);
    }

    @Test
    public void canCalculateMarkUpOfAccessory(){
        assertEquals(2.25, accessory.calulateMarkUp(), 0.01);
    }

}
