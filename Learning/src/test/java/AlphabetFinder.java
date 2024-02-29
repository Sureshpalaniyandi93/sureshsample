import java.util.Scanner;

public class AlphabetFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        String next = sc.next();
        char c = next.charAt(0);
        boolean alphabetic = Character.isLetterOrDigit(c);
        if(alphabetic==true){
            System.out.println("isAlphabet");
        }
        boolean digit = Character.isDigit(c);
        if(digit==true){
            System.out.println("Is Digit");
        }
        if(digit==false){
            System.out.println("NSpecial character");
        }
    }
}
