package collections.handler;

import collections.*;
import java.util.*;

public class MapHandler {
    public void processMaps(Map<String, Integer> nameMap) {
        processMap(new HashMap<>(nameMap), new HashMapProcessor<>());
        processMap(new TreeMap<>(nameMap), new TreeMapProcessor<>());
    }

    private <K, V, M extends Map<K, V>> void processMap(M map, ICollectionProcessor<M> processor) {
        processor.process(map);
    }
}
