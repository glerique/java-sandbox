package collections;

public abstract class AbstractCollectionProcessor<T> implements CollectionProcessor<T> {

    private final String type;

    public AbstractCollectionProcessor(String type) {
        this.type = type;
    }

    @Override
    public void process(T collection) {
        System.out.println("Traitement de la collection de type " + type + " : " + collection);
    }
}
