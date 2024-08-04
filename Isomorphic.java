package stringa;
import java.util.*;
//
//public class Isomorphic {
//        static void isIsomorphic(String s, String t) {
//        HashMap <Character, Character> map1 = new HashMap<>();
//        HashMap <Character, Character> map2 = new HashMap<>();
//        if (s.length() != t.length()) {
//            System.out.println("false");
//            return;
//        }
//        for (int i = 0; i < s.length(); i++) {
//
//
//        }
//        }
//
//    public static void main(String[] args) {
//        String s = "foo";
//        String t = "bar";
//
//        isIsomorphic(s,t);
//    }
//}

class Sol {
    static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        int n = 1;
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);

            } else {
                map1.put(c, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char d = t.charAt(i);
            if (map1.containsKey(d)) {
                map1.put(d, map1.get(d) - 1);
            } else {
                return false;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map1.get(c) != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
         System.out.println(Sol.isAnagram(s, t));

    }
}

class find{
    static void reversePrefix(String word, char ch) {
        StringBuilder new_s = new StringBuilder();
        int a = word.indexOf(ch);
        String to_reverse=word.substring(0,a+1);
        int n = word.length()-1;
//        System.out.println(to_reverse);

        for(int i=a;i>=0;i--){
            char c = to_reverse.charAt(i);
            new_s.append(c);
        }
        System.out.println(new_s);

//        for(int i =a+1;i<word.length();i++){
//            char c = word.charAt(i);
//            new_s.append(c);
//        }
//        return new_s.toString();
    }
    public static void main(String[] args) {
        String s = "xyxzxe";
        char ch ='z';
        reversePrefix(s,ch);
//       System.out.println(reversePrefix(s, ch));
    }
}

