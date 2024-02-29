package Demo;

public class LargestNumberInArray {

    public static void main(String[] args) {

        int a[] = {12, 22, 33, 132, 432, 909};
        int max = a[0];
        int minimum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            // Update minimum if a smaller value is found
            else if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + minimum);
    }
}
