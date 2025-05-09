package greeting.exception;
import greeting.exception.IExceptionHandler;

public class SimpleExceptionHandler implements IExceptionHandler {
    @Override
    public void handle(Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
    }
}
