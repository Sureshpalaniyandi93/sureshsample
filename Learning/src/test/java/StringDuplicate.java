import java.util.HashMap;
import java.util.HashSet;

public class StringDuplicate {
    public static void main(String[] args) {
        String  s= "suresh";
        String ss= "selvam";

        for(int i=0;i<s.length();i++){
            for (int j=0;j<ss.length();j++){
                if(s.charAt(j)==ss.charAt(i)){
                    System.out.println(s.charAt(j));
                }

            }
        }
    }
}
