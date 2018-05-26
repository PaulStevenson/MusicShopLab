package Enums;

public enum AccessoryType {

    PARTS("Replacement Parts"),
    ACCESSORIES("Accessories"),
    SHEETMUSIC("Sheet Music"),
    CASES("Instrument Cases");

    protected String itemName;

    AccessoryType(String itemName){
        this.itemName = itemName;
    }

    public String hasItemName(){
        return this.itemName;
    }


}
