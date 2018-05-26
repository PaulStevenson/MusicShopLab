package Stock;

import Stock.Stock;

public abstract class Accessory extends Stock {


    private String name;

    public Accessory(String name, double rrp, double buyIn) {
        super(rrp, buyIn);
        this.name = name;
    }

    @Override
    public double calculateMarkUp(double rrp, double buyIn) {
        return 0;
    }

    public String getName() {
        return name;
    }
}
