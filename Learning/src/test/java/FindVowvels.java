import java.util.Scanner;

public class FindVowvels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Value :");
        String next = sc.next();
        char c = next.charAt(0);

        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println("Given value is in vowels");
        }else {
            System.out.println("Constant");
        }

    }
}
