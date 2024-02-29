import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class TotalCount {
    public static void main(String[] args) {

        String s = "i am a automaTion &%test enGineer";
        int count = 0;
        s = s.toLowerCase();
        int vCount = 0;
        int sCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vCount++;
            } else if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
                sCount++;
            }
        }
        System.out.println("total count of String is " + count);
        System.out.println("total novels in String " + vCount);
        System.out.println("total special in String " + sCount);
    }
}



