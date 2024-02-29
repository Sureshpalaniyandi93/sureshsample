package Demo;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

        ArrayList l2= new ArrayList();
        l2.add("cd");
        l2.add("cf");
        ArrayList l1= new ArrayList();
        l1.add("ab");
        l1.add("bc");
        l1.addAll(l2);
        System.out.println(l1);
    }
}
