public class Swap {
    public static void main(String[] args) {
        int a= 10;   //30
        int b= 20;   //10
//        int temp=a;
//        a=b;
//        b=temp;

        a=a+b; //10+20=   a=30
        b=a-b; // 30-10 = b=20
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
