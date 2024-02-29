import org.apache.poi.hssf.record.PageBreakRecord;

import java.util.Scanner;

public class UpperLoweSpecial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        String next = sc.next();
        char c = next.charAt(0);

        boolean lowerCase = Character.isLowerCase(c);
        if (lowerCase == true) {
            System.out.println("LowerCase");
        }
        boolean upperCase = Character.isUpperCase(c);
         if (upperCase == true) {
            System.out.println("UpperCase");
        }
        boolean spaceChar = Character.isLetterOrDigit(c);
        if (spaceChar == false) {
            System.out.println("SpecialCase");
        }



    }
}
