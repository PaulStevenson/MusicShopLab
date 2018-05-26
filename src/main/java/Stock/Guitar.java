package Stock;

import Enums.GuitarType;

import static Enums.GuitarType.ACOUSTIC;

public class Guitar extends Instrument{

    protected Enum numberOfStrings;


    public Guitar(double rrp, double buyIn, Enum instrumentType, String make, String model, String description, GuitarType numberOfStrings) {
        super(rrp, buyIn, instrumentType, make, model, description);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public double calculateMarkUp(double rrp, double buyIn) {
        return 0;
    }

    public int getNumberOfStrings() {
        return ACOUSTIC.getNumberOfStrings();
    }
}
