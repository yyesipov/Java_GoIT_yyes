package module10.task5;

public class ThirdException extends Exception{
    private String message;

    public ThirdException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Third Exception: " +
                message;
    }
}
