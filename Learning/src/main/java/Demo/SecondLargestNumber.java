package Demo;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int maximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        int thirdMaximum = Integer.MIN_VALUE;
        int a[] = {11, 22, 15, 44, 321, 234, 12543};

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximum) {

                thirdMaximum = secondMaximum;

                secondMaximum = maximum;

                maximum = a[i];

            }
            else if (a[i] > secondMaximum) {

                thirdMaximum = secondMaximum;

                secondMaximum = a[i];

            }
            else if (a[i] > thirdMaximum) {

                thirdMaximum = a[i];
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Second Maximum: " + secondMaximum);
        System.out.println("Third Maximum: " + thirdMaximum);
    }
}
