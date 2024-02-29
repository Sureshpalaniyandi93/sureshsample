public class CountEvenOddNumbers {
    public static void main(String[] args) {

        int number =1234578;
        int oddnumber=0;
        int evennumber=0;
        while(number>0){
            int rem = number%10;
            if(rem%2==0){
                evennumber++;
            }else {
                oddnumber++;
            }
            number= number/10;
        }
        System.out.println("odd number is "+oddnumber);
        System.out.println("even number is "+evennumber);

    }
}
