package app.qubid.common.model.item;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String itemId;
    private String name;
    private String description;
    private final String sellerId;
    private BigDecimal initialPrice;

    protected Item(String itemId, String name, String description,
                   BigDecimal initialPrice, String sellerId) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.initialPrice = initialPrice;
        this.sellerId = sellerId;
    }

    public String getId() { return this.itemId; }
    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public String getSellerId() { return this.sellerId; }
    public BigDecimal getInitialPrice() { return this.initialPrice; }

    public void setName(String newName) {
        if (name == null || name.isBlank()) {}
        else name = newName;
    }

    public abstract ItemType getType();
    public abstract String getCategory();
    public abstract String getSpecificInfo();
}
