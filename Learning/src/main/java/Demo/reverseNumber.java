package Demo;

import java.util.ArrayList;
import java.util.List;

public class reverseNumber {
    public static void main(String[] args) {

        List l = new ArrayList();
        List ls = new ArrayList();
        l.add("suresh");
        l.add("keerti");
        l.add("selvam");
        l.add("mani");
        System.out.println(l);

        for(int i=l.size()-1;i>=0;i--){
            Object object = l.get(i);
//            System.out.println(object);
            ls.add(object);

        }
        System.out.println(ls);
    }
    }
