package app.qubid.common.model.item;

public class Electronics extends Item {
    private static final long serialVersionUID = 1L;
    
    private final String brand;
    private final String model;
    private int warrantyMonths;

    public Electronics(String itemId, String name, String description,
                       BigDecimal initialPrice, String sellerId,
                       String brand, String model, int warrantyMonths) {
        super(itemId, name, description, initialPrice, sellerId);
        this.brand = brand;
        this.model = model;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public ItemType getType() { return ItemType.ELECTRONICS; }
    @Override
    public String getCategory() { return "Electronics"; }
    @Override
    public String getSpecificInfo() {}
}
