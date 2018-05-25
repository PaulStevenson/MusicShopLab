import Stock.Guitar;
import Stock.Instrument;
import org.junit.Before;

import static Enums.InstrumentType.STRING;


public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Guitar(300, 150, STRING, "Fender", "Model", "Five Stars");
    }


}
