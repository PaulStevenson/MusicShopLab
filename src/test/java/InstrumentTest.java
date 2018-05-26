import Enums.GuitarType;
import Stock.Guitar;
import Stock.Instrument;
import org.junit.Before;
import org.junit.Test;

import static Enums.InstrumentType.STRING;
import static org.junit.Assert.assertEquals;
import static sun.audio.AudioPlayer.player;


public class InstrumentTest {

    Instrument instrument;

    @Before
    public void before(){
        instrument = new Guitar(300, 150, STRING, "Fender", "Model", "Five Stars", GuitarType.ELECTRIC);
    }




}
