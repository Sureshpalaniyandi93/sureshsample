import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] myArray = {10, 5, 8, 20, 15};
        int largest = findLargest(myArray);

        System.out.println("The largest number is: " + largest);
    }

    public static int findLargest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array should not be empty");
        }

        return Arrays.stream(arr).max().orElseThrow();
    }
}
