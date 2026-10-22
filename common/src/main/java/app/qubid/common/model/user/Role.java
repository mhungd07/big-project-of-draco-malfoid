package app.qubid.common.model.user;

public enum Role {
    BIDDER("Bidder"),
    SELLER("Seller"),
    ADMIN("Admin");

    private final String label;
    private Role(String label) {
        this.label = label;
    }

    public String getLabel() { return this.label; }
}
