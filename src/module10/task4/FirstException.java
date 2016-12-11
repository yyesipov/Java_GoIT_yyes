package module10.task4;

public class FirstException extends Exception {

    private String message;

    public FirstException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FirstException: " +
                message;
    }
}
