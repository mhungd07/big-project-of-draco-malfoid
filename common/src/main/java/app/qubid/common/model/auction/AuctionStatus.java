package app.qubid.common.model.auction;

public enum AuctionStatus {
    PENDING("Pending"),
    RUNNING("Ongoing"),
    FINISHED("Ended"),
    PAID("Payment completed"),
    CANCELLED("Cancelled");

    private final String label;
    private AuctionStatus(String label) {
        this.label = label;
    }

    public String getLabel() { return this.label; }
    public boolean acceptsBid() { return this == RUNNING; }
    public boolean canForwardTo(AuctionStatus next) {
        return switch(this) {
            case PENDING   -> next == RUNNING || next == CANCELLED;
            case RUNNING   -> next == FINISHED || next == CANCELLED; 
            case FINISHED  -> next == PAID || next == CANCELLED;
            case PAID, CANCELLED -> false;
        };
    }
    
}
