package greeting.service;
import greeting.model.User;

public class Greeter {
    public String sayHello(User user) {
        return "Bonjour " + user.getName();
    }
}
