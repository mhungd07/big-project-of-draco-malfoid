package app.qubid.common.model.user;

public class Admin extends User {
    @Override
    public Role getRole() { return Role.ADMIN; }

    @Override
    public String getDisplayInfo() {}
}
