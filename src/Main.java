import greeting.model.User;
import greeting.service.Greeter;
import greeting.util.MessagePrinter;
import greeting.handler.UserHandler;
import collections.handler.CollectionHandler;
import collections.handler.MapHandler;
import java.util.List;
import java.util.Map;
import greeting.exception.SimpleExceptionHandler;

public class Main {
    public static void main(String[] args) {
        User user = new User(null);
        Greeter greeter = new Greeter();
        MessagePrinter printer = new MessagePrinter();
        SimpleExceptionHandler exceptionHandler = new SimpleExceptionHandler();

        UserHandler userHandler = new UserHandler(greeter, printer, exceptionHandler);
        userHandler.greetUser(user);

        List<String> names = List.of("Maurice", "Miguel", "Gilbert", "Fred");
        Map<String, Integer> nameMap = Map.of("Maurice", 1, "Miguel", 2, "Gilbert", 3, "Fred", 4);

        CollectionHandler collectionHandler = new CollectionHandler();
        collectionHandler.processCollections(names);

        MapHandler mapHandler = new MapHandler();
        mapHandler.processMaps(nameMap);
    }
}