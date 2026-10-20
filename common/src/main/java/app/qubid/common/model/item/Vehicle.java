package app.qubid.common.model.item;

import java.math.BigDecimal;

public class Vehicle extends Item {
    private static final long serialVersionUID = 1L;
    
    private final String brand;
    private final String model;
    private final int manufactureYear;

    public Vehicle(String itemId, String name, String description,
                       BigDecimal initialPrice, String sellerId,
                       String brand, String model, int manufactureYear) {
        super(itemId, name, description, initialPrice, sellerId);
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public ItemType getType() { return ItemType.VEHICLE; }
    @Override
    public String getCategory() { return "Vehicle"; }
    @Override
    public String getSpecificInfo() {}
}
