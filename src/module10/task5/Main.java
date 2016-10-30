package module10.task5;

public class Main {

    public static void main(String[] args) {

        try {
            new TestThrow().test();
        } catch (FirstException | SecondException | ThirdException e) {
            System.err.println(e);
        }
    }
}
