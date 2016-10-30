package module10.task2;

public class TestOwnExeption extends Exception{

    private String message;

    public TestOwnExeption(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Incorrect input: "
                 + message;
    }
}
