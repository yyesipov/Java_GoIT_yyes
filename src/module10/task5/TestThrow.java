package module10.task5;

public class TestThrow {

    public void test() throws FirstException, SecondException, ThirdException{
        int[] arr = new int[]{5, 5, 2, 1, 3};
        for (int i : arr) {
            System.out.println(i);
            if (i == 1){
                throw new FirstException("1 is found!");
            }
            if (i == 2){
                throw new SecondException("2 is found!");
            }
            if (i ==3) {
                throw new ThirdException("3 is found");
            }
        }
    }
}
