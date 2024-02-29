public class LargeNumberInArray {
    public static void main(String[] args) {
        int arr[] = {26, 45, 67, 89, 100, 23,
                3456, 897, 452, 444, 899, 100, 7000};

        int max = arr[0];
        int minimum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];

            }
        }
        System.out.println(max);
        System.out.println(minimum);
    }
}
