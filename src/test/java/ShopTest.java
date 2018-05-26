import Stock.Stock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Stock stock;

    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void shopHasStockItems(){
        assertEquals(0, shop.getNumberOfStockItems());
    }
}
