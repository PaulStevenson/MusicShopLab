import Stock.Guitar;
import Stock.Instrument;
import org.junit.Before;

public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Guitar(300, 150, "Fender", "Model", "Five Stars");
    }


}
