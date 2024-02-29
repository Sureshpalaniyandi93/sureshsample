import java.util.HashMap;

public class occurrencesCount {
    public static void main(String[] args) {
        String s = "keerthana";

        HashMap<Character, Integer> map = new HashMap();

        char[] character = s.toCharArray();
        for (char ch : character) {
            if (!map.containsKey(character)) {
                map.put(ch, 1);
            } else {
                int value = map.get(ch);
                map.put(ch, value + 1);

            }

        }


//       HashMap<Character, Integer> map = new HashMap<>();
//
//        char[] charcter = s.toCharArray();
//        for (char ch : charcter){
//            if(!map.containsKey(ch)){
//                map.put(ch,1);
//            }
//            else {
//                int value = map.get(ch);
//                map.put(ch, value+1);
//            }
//        }
        System.out.println(map);


    }
}