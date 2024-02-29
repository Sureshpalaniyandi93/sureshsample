package Demo;

public class StringReverse {
    public static void main(String[] args) {
        String reverse = "abcba";
        String s1="";

        for(int i=reverse.length()-1;i>=0;i--){
           s1=s1+reverse.charAt(i);}
           boolean equals = s1.equals(reverse);
           if(equals==true){
               System.out.println("is palindrome");
           }else {
               System.out.println("is Not palindrome");

           }

       }

    }


