package practice;

public class primeNumber {
    public static void main(String[] args) {

        int number = 991;
        int count = 0;


        for (int i = 1; i <=number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println("is prime number");
            } else {
                System.out.println("is not prime number");
            }

    }
}
