package app.qubid.common.model.auction;

import app.qubid.common.model.item.Item;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Auction implements  Serializable {
    private final String auctionId;
    private final Item item;
    private AuctionStatus status = AuctionStatus.PENDING;
    private BigDecimal currentPrice;
    private String leadingBidderId;
    private final List<Bid> bids = new ArrayList<>();
}
