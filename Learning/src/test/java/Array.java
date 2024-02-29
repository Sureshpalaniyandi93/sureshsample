
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Array {
    public static void main(String[] args) {
        List al = new ArrayList();

        al.add(10);
//        al.add("suresh");
        al.add(1222);
        al.add(2321);
        al.add(1);

        al.add(10);
        System.out.println(al);

        Set s = new TreeSet(al);
        System.out.println(s);


//        System.out.println("2222"+al);
//        Object[] objects = al.toArray();
//        System.out.println("111"+al);
//////        al.remove(1);
//        int size = al.size();
//        al.add(1, "keerthana");
////        al.set(1,"gowtham");
//        System.out.println(al);
//
        ArrayList al2 = new ArrayList();
        al2.add("selvam");
        al2.add("senthil");
        al2.add("mani");
        al2.addAll(1,al);
        System.out.println(al2);

//        ArrayList al3 = new ArrayList();
//        al3.add("chennai");
//        al3.add("mumbai");
//        al3.add("namakkal");
//        al3.addAll(2, al);
//        System.out.println(al3);
//        List al4 =al3.subList(1,5);
//        System.out.println(al4);


    }
}

