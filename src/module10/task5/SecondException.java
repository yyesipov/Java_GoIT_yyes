package module10.task5;

public class SecondException extends Exception {
    private String message;

    public SecondException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Second Exception: " +
                message;
    }
}
