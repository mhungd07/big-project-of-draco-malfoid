package app.qubid.common.model.user;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
    // private double rating;
    // private int ratingCount;
    private BigDecimal earnings;
    private List<String> itemIds = new ArrayList<>();
    private List<String> auctionIds = new ArrayList<>();

    @Override
    public Role getRole() { return Role.SELLER; }

    @Override
    public String getDisplayInfo() {}
}
