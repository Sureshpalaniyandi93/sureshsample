package Demo;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, 4, 5};
        int b[] = new int[]{1, 3, 4, 5};

        if (Arrays.equals(a, b)) {
            System.out.println("Arrays Are equal");
        } else {
            System.out.println("Arrays Are Not equal");
        }
    }
}
