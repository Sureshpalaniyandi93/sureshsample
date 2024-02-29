package practice;

public class reverseString {
    public static void main(String[] args) {

       String input ="suresh palaniyandi";


        char reverse;
       for(int i=input.length()-1;i>=0;i--){
            reverse=input.charAt(i);
           System.out.print(reverse);

       }




    }
}
