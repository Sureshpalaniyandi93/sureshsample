package practice;

import org.checkerframework.checker.mustcall.qual.CreatesMustCallFor;

public class countSum {

    public static void main(String[] args) {

        int number=123456789;
        int count=0;
        int remind=0;
        while(number>0){
             remind = number%10;
             count+=remind;
            number=number/10;
        }
        System.out.println(count);
    }
}
