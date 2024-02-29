import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class practice {
    public static void main(String[] args) {
//        String string = "i am suresh palaniyandi";
//        int count=0;
//        int vCount=0;
//        int sCount=0;
//        String s = string.toLowerCase();
//        List list = new ArrayList();
//
//        for (int i=0; i<s.length();i++){
//            if(s.charAt(i)!=' '){
//                count++;
//
//            }
//            if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
//                vCount++;
//            } else if (s.charAt(i) >'a' && s.charAt(i)<'z'){
//                sCount++;
//
//            }
//        }
//        System.out.println("vowels total counts are : "+ vCount);
//        System.out.println("non-vowels total counts are : "+ sCount);

//******************************************************************************************************

        // primeNumber

//        int count = 0;
//
//        for (int i = 2; i <= 10; i++) {
//            for (int j = 2; j <=i; j++) {
//                if (i % j == 0) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.println(i);
//
//            }
//            count = 0;
//        }

//******************************************************************************************************

//        //reverseNumber
//
//        int number =232123122;
//        int reverse =0;
//        int remind =0;
//
//        while(number>0){
//            remind= number%10;
//            reverse=reverse*10+remind;
//            number=number/10;
//
//        }
//        System.out.println(reverse);
        // string duplicate

//        String s= "se";
//        String ss= "set";
//
//        for (int i=0;i<s.length();i++){
//            for (int j=0;j<ss.length();j++){
//                if(ss.charAt(j)==s.charAt(i)){
//                    System.out.print(ss.charAt(j));
//                }

//******************************************************************************************************

        //odd even number

//            int number=30;
//            List odd = new ArrayList();
//            List even = new ArrayList();
//
//            for(int i=1;i<number;i++){
//
//                if(i%2==0){
//                    even.add(i);
//
//                } else{
//                    odd.add(i);
//
//                }
//            }
//        System.out.println("Even numbers are : "+even);
//        System.out.println("odd numbers are  : "+odd);
//******************************************************************************************************
//        occurrencesCount
//        String s = "abcdabcd";
//        HashMap<Character, Integer> map = new HashMap<>();
//        char[] character = s.toCharArray();
//
//        for( char ch :character){
//            if(map.containsKey(ch)){
//                map.put(ch,1);
//            }
//            else {
//                int value = map.get(ch);
//                map.put(ch,value+1);
//
//            }
//        }
//        System.out.println(map);
//******************************************************************************************************


        // Largest number
//        int[] a = {10, 5, 8, 0, 15};
//        int maximumNumber=0;
//
//        for (int i=0;i<a.length;i++){
//            if(a[i]>maximumNumber){
//                maximumNumber=a[i];
//            }
//        }
//        System.out.println("Maximum number is :" +maximumNumber);


        // largest number and lest Number

        int [] num ={2,3,4,5,6,7,8,97,654};
        int maximum=num[0];
        int minimum=num[0];

        for (int i=0;i<num.length;i++){
            if(num[i]>maximum){
                maximum=num[i];
            } else if (num[i]<minimum) {
                minimum=num[i];
            }
        }
        System.out.println("Maximum Number is :"+maximum);
        System.out.println("Minimum  Number is :"+minimum);




    }


}