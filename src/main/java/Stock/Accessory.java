package Stock;

import Enums.AccessoryType;
import Stock.Stock;
import com.sun.tools.javac.code.Attribute;

import static Enums.AccessoryType.ACCESSORIES;

public class Accessory extends Stock {


    private String name;
    private AccessoryType accessoryType;

    public Accessory(String name, AccessoryType accessoryType, double rrp, double buyIn) {
        super(rrp, buyIn);
        this.name = name;
        this.accessoryType = accessoryType;
    }

    @Override
    public double calculateMarkUp(double rrp, double buyIn) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String hasAccessoryCategory(){
        return ACCESSORIES.hasAccessoryCategory();
    }
}
