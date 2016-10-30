package module10.task1;

public class Main {

    public static void main(String[] args) {

        try {
            int[] arr = new int[]{1, 2, 3, 4, 5, 0, 7};
            for (int i : arr) {
                if (i == 0) {
                    throw new Exception("0 is found!");
                } else System.out.println(i);
            }
        } catch (Exception e) {
            System.err.println("We have a problem: " + e.getMessage());
        } finally {
            System.err.println("Finish");
        }
    }
}
