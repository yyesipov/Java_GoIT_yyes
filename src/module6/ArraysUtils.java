public final class ArraysUtils {

    @Override
    public String toString() {
        return "ArraysUtils{}";
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;

    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 && maxPositive < array[i]) {
                maxPositive = array[i];
            }
        }
        return maxPositive;
    }

    public static long multiplication(int[] array) {
        long multiplication = 1;
        for (int item : array) {
            multiplication = item * multiplication;
        }
        return multiplication;
    }

    public static int modulus(int[] array) {
        int mod;
        mod = array[0] % array[array.length - 1];
        return mod;
    }

    public static int secondLargest(int[] array) {
        int firstLargest = array[0];
        int secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    public static int[] reverse(int[] array) {
        int a[] = new int[array.length];
        for (int i = 0; i < array.length / 2; i++) {
            a[i] = array[i] + array[array.length - 1 - i];
            a[array.length - 1 - i] = a[i] - array[array.length - 1 - i];
            a[i] = a[i] - a[array.length - 1 - i];
        }
        return a;
    }

    public static int[] findEvenElements(int[] array) {
        int preFind[] = new int[array.length];
        int counter = 0;
        for (int i = 0; i <array.length; i++){
            if(array[i] != 0){
              if (array[i] % 2 == 0){
                  preFind[counter] = array[i];
                  counter++;
              }
           }
        }
        int findEvenEl[] = new int[counter];
        for (int j = 0; j < counter; j++){
           if (preFind[j] != 0){
               findEvenEl[j] = preFind[j];
           }
        }
        return findEvenEl;
    }
}
