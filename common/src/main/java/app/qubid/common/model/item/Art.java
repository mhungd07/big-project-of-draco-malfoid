package app.qubid.common.model.item;

import java.math.BigDecimal;

public class Art extends Item {
    private final String artist;
    private final int yearCreated;

    public Art(String itemId, String name, String description,
                       BigDecimal initialPrice, String sellerId,
                       String artist, int yearCreated) {
        super(itemId, name, description, initialPrice, sellerId);
        this.artist= artist;
        this.yearCreated= yearCreated;
    }

    @Override
    public ItemType getType() { return ItemType.ART; }
    @Override
    public String getCategory() { return "Art"; }
    @Override
    public String getSpecificInfo() {}
    
}
