package module10.task3;

public class Main {
    public static void main(String[] args) {
        try {
            String str = new String("SomeString");
            str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("You reference to a null object");
        }
    }
}
