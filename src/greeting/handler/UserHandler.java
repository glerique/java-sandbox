package greeting.handler;

import greeting.model.User;
import greeting.service.Greeter;
import greeting.util.MessagePrinter;

public class UserHandler {
    private final Greeter greeter;
    private final MessagePrinter printer;

    public UserHandler(Greeter greeter, MessagePrinter printer) {
        this.greeter = greeter;
        this.printer = printer;
    }

    public void greetUser(User user) {
        String message = greeter.sayHello(user);
        printer.print(message);
    }
}