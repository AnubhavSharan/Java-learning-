package stringa;
import java.util.*;

public class Permutation {
        static int findPermutationDifference(String s, String t) {
            int i=0;
            int cnt=0;
            while(i<=s.length()-1) {
                char c_s=s.charAt(i);
                for(int j =0;j<t.length();j++){

                     char c_t=t.charAt(j);
                     if(c_s==c_t){
                         if(i<j){
                             cnt+=j-i;

                        }else{
                            cnt+=i-j;

                    }

                    i++;
            }

            }
            }

            return cnt;

        }
        public static void main(String[] args) {
            String a="abc";
            String b="bac";
            System.out.print(findPermutationDifference(a,b));
        }
    }

class Solution {
    static void findWordsContaining(String[] words, char x) {
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=0){
                arr.add(i);
            }
            }
             System.out.println(arr);
    }

     public static void main(String[] args) {
        String []words = {"leet","code"};
        char x = 'e';
        findWordsContaining(words,x);
    }
}


class CommonPrefix {
    static String findWordsContaining(String[] strs) {
        if (strs == null || strs.length == 0) {
             System.out.println("null");

        }


        String prefix = "flow";
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }


    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
//        findWordsContaining(words);
        System.out.println(findWordsContaining(words));
    }
}

//class CommonPrefix2 {
//    public String longestCommonPrefix(String[] strs) {
//        StringBuilder s = new StringBuilder();
//        int index =0;
//        int n = 0;
//        if(strs.length==0){
//            return " ";
//        }else if(strs.length==1){
//            return strs[0];
//
//        }else {
//            for (int i = 0; i < strs.length - 1; i++) {
//                if (strs[i].length() == 0) {
//                    return "";
//                }
//                boolean th = true;
//                while (th) {
//                    if (strs[i].charAt(index) == strs[i + 1].charAt(index)) {
//                        index++;
//                    } else {
//                        th = false;
//                    }
//                }
//            }
//
//            return s.append(strs[0].substring(0,index)).toString();
//
//        }
//        public static void main(String[] args) {
//            String[] words = {"a"};
//            char x = 'e';
////        findWordsContaining(words);
//            System.out.println((words));
//        }
//    }
//
//}
//


