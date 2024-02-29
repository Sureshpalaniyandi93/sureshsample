package practice;

public class sumOfArray {

    public static void main(String[] args) {


        int a[] = {13,35};
        int odd_sum = 0;
        int even_sum = 0;

        for (int i = 0;i<a.length;i++){
           if(a[i]%2==0){
               even_sum=odd_sum+a[i];
           }else {
               odd_sum=even_sum+a[i];
           }
        }
        System.out.println("odd numbers Sum is "+odd_sum);
        System.out.println("even number sum is "+even_sum);
    }
}
