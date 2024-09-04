package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class SwapNum {
        static List<Integer> get(int a, int b) {
            // code here
            ArrayList<Integer> s = new ArrayList<>();
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            s.add(a);
            s.add(b);
            return s;
        }

        public static void main(String[] args) {
            int a = 5;
            int b = 9;
            System.out.print(get(a,b));
        }
}
