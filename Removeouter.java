package stringa;
import java.util.*;

import java.security.SecureRandom;
import java.util.Stack;

public class Removeouter {
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(Parentheses(s));


    }
    static String Parentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.charAt(i) == '(') {
                if (stack.size() > 0) {
                    sb.append(c);
                }
                stack.push(c);
            }else{
                stack.pop();
                if(stack.size() > 0) {
                    sb.append(c);
                }
            }

        }
        return sb.toString();
    }
}

class Ascii{
    public static void main(String[] args) {
        String s = "zaz";
        int cnt=0;
    for (int i = 0; i < s.length()-1; i++) {
        char c = s.charAt(i);
        char d = s.charAt(i+1);

        if(c>d){
            cnt=cnt+c-d;
        }else{
            cnt=cnt+d-c;
        }

    }
    System.out.println(cnt);
    }
}

class Reverse{
    public static void main(String[] args) {
        String s = "the sky is blue";

        System.out.println(StringRev(s));



    }
    static String StringRev(String s){

        String a = s.trim();
        String b = a.replace(" ","");
        int n = b.length()-1;
        String rev_s="";
        for (int i = n; i >=0; i--) {
            char c = b.charAt(i);
            rev_s=rev_s+c+" ";

        }
        return rev_s.trim();

        }
    }


class Solution3 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static void main(String[] args) {
        int[] A = { 2,1,2 };
        System.out.println(majorityElement(A));
    }

    static int majorityElement(final int[] A) {

        int n= A.length;

        int major=n/2;
        HashMap <Integer,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);

            }else{
                map.put(A[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue() > major){
                return it.getKey();
            }
        }
        return -1;
    }
}





