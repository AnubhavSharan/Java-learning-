package stringa;
import java.util.*;

public class RevStr {
    public static void main(String[] args)
    {
        String s = " TUF is great for interview  preparation ";
        System.out.println("After reversing words: ");
//        System.out.println(s);
        s += " ";
        Stack<String> st = new Stack<String>();
        int i;

        String str = "";
        for (i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);
    }
}

class Main {
    public static void main(String[] args) {
        String s ="35427";
        System.out.println(largestOdd(s));
    }

    public static String largestOdd(String num) {
        StringBuilder n = new StringBuilder();
        for (int i =0; i < num.length(); i++) {
            for (int j = i+1; j < num.length(); j++) {
                String substr = num.substring(i, j);
                if (Integer.parseInt(substr) % 2 != 0) {
                    return substr;
                }
            }
        }
        return "";
    }
}


class Solutions {
    public static void main(String[] args) {
        String s ="52";
        System.out.println(largestOddNumber(s));
    }
    static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            char c = num.charAt(i);
            int p=(int)c;
            if(p%2!=0){
                return num.substring(0,i+1);
        }

    }
        return "";
    }
}



