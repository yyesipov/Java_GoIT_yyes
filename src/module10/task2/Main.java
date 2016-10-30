package module10.task2;

public class Main {

    public static void main(String[] args) {
        try {
            String str = new String("StringPas");
            if (str.length() < 10){
                throw new TestOwnExeption("length of the password should be at least 10 characters!");
            } else System.out.println("Password: " + str);
        }catch (TestOwnExeption e){
            System.err.println(e);
        }
    }
}
