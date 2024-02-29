public class GreatestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        int c = 40;
        if (a > b && a > c) {
            System.out.println("A is Greatest Number");
        } else if (b>c && b>a) {
            System.out.println("B is Greatest Number");
        }else {
            System.out.println("c is Greatest Number");
        }
    }
}
