package module3.task2;

public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int sum;
        sum = this.a + this.b;
        System.out.println("sum = " + sum);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}



