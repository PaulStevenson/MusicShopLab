import Stock.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Pick", 2.00, 0.75);
    }

    @Test
    public void hasName(){
        assertEquals("Pick", accessory.getName());
    }
}
