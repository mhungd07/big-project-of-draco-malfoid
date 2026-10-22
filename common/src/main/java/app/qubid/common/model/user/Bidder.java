package app.qubid.common.model.user;

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Bidder extends User {
    private BigDecimal balance;
    private BigDecimal reserveAmount;
    private List<String> joinedAuctionIds = new ArrayList<>();
    private List<String> wonAuctionIds = new ArrayList<>();

    @Override 
    public Role getRole() { return Role.BIDDER; }

    @Override
    public String getDisplayInfo() {}
    
}
