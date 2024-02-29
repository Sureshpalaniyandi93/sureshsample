package practice;

public class CountOddEvenNumber {
    public static void main(String[] args) {

        int number=2;
        int odd=0;
        int even=0;

        while(number>0){
            int remnder=number%10;
            if(remnder%2==0){
                even++;
            }
            else{
                odd++;
            }
            number=number/10;


        }
        System.out.println("total odd numbers are :"+ odd);
        System.out.println("total even numbers are :"+ even);

    }
}
