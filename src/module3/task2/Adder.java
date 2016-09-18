package module3.task2;

public class Adder extends Arithmetic {
    private boolean result;


    public Adder(int a, int b, boolean result) {
        super(a, b);
        this.result = result;
    }

    public void compare() {
        if (getA() >= getB()) {
            result = true;
        } else result = false;
        System.out.println("Result of compare - " + result);
    }
}
