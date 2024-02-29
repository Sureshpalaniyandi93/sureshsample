package Demo;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        int factorialNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            factorialNumber = factorialNumber * i;
        }
        System.out.println(factorialNumber);
    }
}
