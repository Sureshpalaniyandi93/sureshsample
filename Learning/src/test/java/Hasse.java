import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Hasse {
    public static void main(String[] args) {

        LinkedList ls = new LinkedList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(10);
        ls.add(40);
        ls.add(20);
        System.out.println("Befor" + ls);

        TreeSet ts = new TreeSet(ls);
        System.out.println("After"+ts);


    }


}
