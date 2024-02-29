package Demo;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String s = "suresh";
        char character = ' ';
        List list = new ArrayList();
        List nonVowels = new ArrayList();
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < s.length(); i++) {

            character=s.charAt(i);
            if(character != 'a'&& character != 'e'&& character != 'i'&& character != 'o'&& character != 'u'){
                System.out.println(s.charAt(i));
            }
            character = s.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

               list.add(s.charAt(i));
               count++;

            } else {
                nonVowels.add(s.charAt(i));
                count1++;

            }
        }
        System.out.print("vowels are " +list);
        System.out.print("non vowels are " +nonVowels);
//        System.out.println("total vowels are "+count);
//        System.out.println("total Non vowels are"+count1);


        }
    }

