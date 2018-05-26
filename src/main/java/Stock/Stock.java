package Stock;

import Interfaces.ISell;

public abstract class Stock implements ISell{

    private double rrp;
    private double buyIn;


    public Stock (double rrp, double buyIn){
        this.rrp = rrp;
        this.buyIn = buyIn;
    }

    public double getRrp() {
        return rrp;
    }

    public double getBuyIn() {
        return buyIn;
    }

    public double calulateMarkUp() {
        return this.rrp -= this.buyIn;
    }

    }
