package security;

import security.indentity.User;

public class SecurityContext {
    private static User user;

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        SecurityContext.user = user;
    }
}
