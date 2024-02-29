package practice;

public class palindrome {
    public static void main(String[] args) {


        String input ="kakakak";
        String in=input;
        String reverse="";

        for (int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);
        }
        if(in.equals(reverse)){
            System.out.println(input+" is palindrome string");
        }else {
            System.out.println(input+" is not palindrome string");
        }








//        int number = 1331;
//        int num=number;
//        int remind = 0;
//        int revers = 0;
//
//        while (number != 0) {
//            remind = number % 10;
//            revers = revers * 10 + remind;
//            number = number / 10;
//        }
//        System.out.println("reverse numbers are "+revers);
//        if (num==revers) {
//            System.out.println("is palindrome number");
//        } else {
//            System.out.println("is Not palindrome number");
//        }
    }
}
