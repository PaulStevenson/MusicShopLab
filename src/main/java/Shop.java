import Stock.Stock;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Stock> stockItems;

    public Shop() {
        stockItems = new ArrayList<>();
    }


    public int getNumberOfStockItems() {
        return stockItems.size();
    }
}
