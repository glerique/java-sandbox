package greeting.handler;

import greeting.exception.IExceptionHandler;
import greeting.model.User;
import greeting.service.Greeter;
import greeting.util.MessagePrinter;

public class UserHandler {
    private final Greeter greeter;
    private final MessagePrinter printer;
    private final IExceptionHandler exceptionHandler;

    public UserHandler(Greeter greeter, MessagePrinter printer, IExceptionHandler exceptionHandler) {
        this.greeter = greeter;
        this.printer = printer;
        this.exceptionHandler = exceptionHandler;
    }

    public void greetUser(User user) {
        try {
            String message = greeter.sayHello(user);
            printer.print(message);
        } catch (Exception e) {
            exceptionHandler.handle(e);
        }
    }
}