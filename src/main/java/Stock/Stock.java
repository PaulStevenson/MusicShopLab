package Stock;

public class Stock {

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
}
