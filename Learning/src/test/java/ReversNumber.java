public class ReversNumber {
    public static void main(String[] args) {

        int Number = 121;
        int tem = Number;
        int remind = 0;
        int reverse = 0;
        while(Number>0) {
            remind = Number % 10;
            reverse = reverse *10+ remind;
            Number = Number / 10;
        }

        if(reverse==tem){
            System.out.println("is palindrome");
        }
        System.out.println(reverse);
    }
}
