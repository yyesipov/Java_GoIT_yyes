package module10.task4;

public class SecondException extends Exception{

    private String message;

    public SecondException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SecondException: " +
               message;
    }
}
