import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8};
        int b [] = {1,2,3,4,5,6,7,8,5,3,87};
        boolean equals = Arrays.equals(a, b);
        if(equals==true){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are Not equal");
        }
    }
}
