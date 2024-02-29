package practice;

public class reverseNumber {
    public static void main(String[] args) {


        //reverse number

        int remind;
        int reverse = 0;
        int number = 19;


        while (number != 0) {
            remind = number % 10;
            reverse = reverse * 10 + remind;
            number=number/10;

        }
        System.out.println(reverse);
    }

}