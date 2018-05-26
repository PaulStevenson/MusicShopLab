package Enums;

public enum AccessoryType {

    PARTS("Replacement Parts"),
    ACCESSORIES("Accessory"),
    SHEETMUSIC("Sheet Music"),
    CASES("Instrument Cases");


    protected String accessoryCategory;

    AccessoryType(String accessoryCategory){
        this.accessoryCategory = accessoryCategory;
    }

    public String hasAccessoryCategory(){
        return this.accessoryCategory;
    }


}
