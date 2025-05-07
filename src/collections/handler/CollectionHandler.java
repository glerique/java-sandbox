package collections.handler;

import collections.*;
import java.util.*;

public class CollectionHandler {
    public void processCollections(List<String> names) {
        processCollection(new HashSet<>(names), new SetProcessor<>());
        processCollection(new ArrayList<>(names), new ListProcessor<>());
        processCollection(new HashSet<>(names), new HashSetProcessor<>());
        processCollection(new TreeSet<>(names), new TreeSetProcessor<>());
        processCollection(new LinkedList<>(names), new LinkedListProcessor<>());
        processCollection(new ArrayList<>(names), new ArrayListProcessor<>());
    }

    private <T, C extends Collection<T>> void processCollection(C collection, ICollectionProcessor<C> processor) {
        processor.process(collection);
    }
}
