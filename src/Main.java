import greeting.model.User;
import greeting.service.Greeter;
import greeting.util.MessagePrinter;

public class Main {
    public static void main(String[] args) {
        User user = new User("Gilbert");
        Greeter greeter = new Greeter();
        MessagePrinter printer = new MessagePrinter();

        String message = greeter.sayHello(user);
        printer.print(message);
    }
}