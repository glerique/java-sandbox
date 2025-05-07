import greeting.model.User;
import greeting.service.Greeter;
import greeting.util.MessagePrinter;
import java.util.*;
import collections.*;

public class Main {
    public static void main(String[] args) {
        User user = new User("Gilbert");
        Greeter greeter = new Greeter();
        MessagePrinter printer = new MessagePrinter();

        String message = greeter.sayHello(user);
        printer.print(message);
        // Liste commune des noms
        List<String> names = List.of("Maurice", "Miguel", "Gilbert", "Fred");

        // Exemples pour les collections
        processCollection(new HashSet<>(names), new SetProcessor<>());
        processCollection(new ArrayList<>(names), new ListProcessor<>());
        processCollection(new HashSet<>(names), new HashSetProcessor<>());
        processCollection(new TreeSet<>(names), new TreeSetProcessor<>());
        processCollection(new LinkedList<>(names), new LinkedListProcessor<>());
        processCollection(new ArrayList<>(names), new ArrayListProcessor<>());


        // Exemples pour les maps
        Map<String, Integer> nameMap = Map.of("Maurice", 1, "Miguel", 2, "Gilbert", 3, "Fred", 4);
        processMap(new HashMap<>(nameMap), new HashMapProcessor<>());
        processMap(new TreeMap<>(nameMap), new TreeMapProcessor<>());
    }

    private static <T, C extends Collection<T>> void processCollection(C collection, ICollectionProcessor<C> processor) {
        processor.process(collection);
    }

    private static <K, V, M extends Map<K, V>> void processMap(M map, ICollectionProcessor<M> processor) {
        processor.process(map);
    }
}