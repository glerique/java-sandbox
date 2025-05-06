package collections;

public abstract class AbstractCollectionProcessor<T> implements CollectionProcessor<T> {
    @Override
    public void process(T collection) {
        System.out.println("Traitement de la collection : " + collection);
    }
}
