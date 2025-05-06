package collections;

import java.util.LinkedList;

public class LinkedListProcessor<T> implements CollectionProcessor<LinkedList<T>> {
    @Override
    public void process(LinkedList<T> collection) {
        System.out.println("Traitement de la LinkedList : " + collection);
    }
}
