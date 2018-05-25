package Stock;

public class Instrument extends Stock {


    private String make;
    private String model;
    private String description;

    public Instrument(double rrp, double buyIn, String make, String model, String description) {
        super(rrp, buyIn);
        this.make = make;
        this.model = model;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
