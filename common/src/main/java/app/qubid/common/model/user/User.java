package app.qubid.common.model.user;

import java.io.Serializable;

public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String userId;
    private String username;
    private String email;
    private String password;
    private boolean active = true;

    protected User(String userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;        
        this.password = password;
        this.email = email;
    }

    public String getId() { return this.userId; }
    public String getUsername() { return this.username; }
    public String getEmail() { return this.email; }

    // public boolean checkPassword(String raw) {}
    public abstract Role getRole();
    public abstract String getDisplayInfo();
}
