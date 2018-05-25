package Stock;

import Enums.InstrumentType;

public abstract class Instrument extends Stock{


    private Enum instrumentType;
    private String make;
    private String model;
    private String description;

    public Instrument(double rrp, double buyIn, Enum instrumentType, String make, String model, String description) {
        super(rrp, buyIn);
        this.instrumentType = instrumentType;
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
