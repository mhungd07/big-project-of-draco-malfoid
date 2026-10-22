package app.qubid.common.model.auction;

import java.io.Serializable;
import java.math.BigDecimal;

public class Bid {
    private final String bidId, auctionId, bidderId;
    private final BigDecimal amount;
}
