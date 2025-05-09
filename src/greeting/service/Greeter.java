package greeting.service;

import greeting.model.User;
import greeting.util.UserValidator;

public class Greeter {
    public String sayHello(User user) {
        UserValidator.validate(user);
        return "Bonjour " + user.getName();
    }
}
