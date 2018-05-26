package Enums;

public enum GuitarType {

    ACOUSTIC(6),
    ELECTRIC(6),
    TWELVESTRING(12);


    protected int numberOfStrings;

    GuitarType(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;

    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }


}
