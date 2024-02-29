import java.util.ArrayList;
import java.util.List;

public class OddEvenNumber {
    public static void main(String[] args) {
        List odd = new ArrayList();
        List even = new ArrayList();

        int number = 30;
//        if (number % 2 == 0) {
//            System.out.println("Even Number");
//        }
//        if (number % 2 != 0) {
//            System.out.println("odd Number");
//        }
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }

        }
        System.out.println("Even number is :"+ even);
        System.out.println("Odd number is :"+ odd);
    }
}
