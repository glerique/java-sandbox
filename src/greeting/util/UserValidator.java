package greeting.util;

import greeting.model.User;

public class UserValidator {
    public static void validate(User user) {
        if (user == null || user.getName() == null) {
            throw new IllegalArgumentException("User or user name cannot be null");
        }
    }
}
