package Stock;

public class Instrument extends Stock {

    private Instrument instrument;
    private String make;
    private String model;
    private String description;

    public Instrument(double rrp, double buyIn, String make, String model, String description) {
        super(rrp, buyIn);
        this.description = description;
        this.make = make;
        this.model = model;
        this.description = description;

    }

    public Instrument getInstrument() {
        return instrument;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
