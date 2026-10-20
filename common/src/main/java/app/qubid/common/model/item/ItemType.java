package app.qubid.common.model.item;

public enum ItemType {
    ELECTRONICS("Electronic device"),
    ART("Artwork"),
    VEHICLE("Vehicle");    

    private final String label;
    private ItemType(String label) {
        this.label = label;
    }

    public String getLabel() { return this.label; }
}
