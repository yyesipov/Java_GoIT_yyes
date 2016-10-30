package module10.task5;

public class FirstException extends Exception{
    private String message;

    public FirstException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "First Exception: " +
                message;
    }
}
