package Linked_list;
import java.util.*;
public class MoreRecursion {
    public int myAtoi(String s){
        StringBuilder st = new StringBuilder("");
        String a = s.trim();
        int sign = 1;
        long cnt = 0;
        int n = a.length();
        int i = 0;
        if(a.isEmpty()){
            return 0;
        }
        else if(a.charAt(0)=='-'){
            sign =-1;
            i++;
        }else{
            if(a.charAt(0)=='+'){
                sign=1;
                i++;
            }
        }
//        String e = a.replace("-","");

        int b = rec(i,a,cnt,n,sign);
        if(sign*b>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(sign*b<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
        return sign*b;
    }
    }
    public int rec(int i, String s, long cnt, int n, int sign){
        if(i==n){
            return (int)cnt;
        }
        char c = s.charAt(i);

        if(!Character.isDigit(c)){
               return (int) cnt;
        }

        if(Character.isDigit(c)){
            cnt =cnt *10 + Character.getNumericValue(c);
        }
        if (sign == 1 && cnt > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (sign == -1 && cnt > (long) Integer.MAX_VALUE + 1) {
            return Integer.MIN_VALUE;
        }
        return rec(i+1,s,cnt,n,sign);

    }
    public static void main(String[] args) {
        MoreRecursion mr = new MoreRecursion();
        String s = "";
        System.out.println(mr.myAtoi(s));

    }
}

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        return helper(s, i, sign, 0);
    }

    private int helper(String s, int i, int sign, long cnt) {
        if (i == s.length()) {
            return (int) (cnt * sign);
        }

        if (!Character.isDigit(s.charAt(i))) {
            return (int) (cnt * sign);
        }

        cnt = cnt * 10 + Character.getNumericValue(s.charAt(i));

        if (cnt > Integer.MAX_VALUE) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return helper(s, i + 1, sign, cnt);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "-132jxznj";
        System.out.println(sol.myAtoi(s));

    }
}

class So {
    public double myPow(double x, int n) {
        double cnt = 1.00;
        int absN = Math.abs(n);
        double a = rec(x, absN, cnt);
        if (n < 0) {
            return 1 / a;
        } else {
            return a;
        }
    }
        private double rec ( double x, int n, double cnt){
            if (n == 0) {
                return cnt;
            }
            cnt = cnt * x;
            return rec(x, n - 1, cnt);
        }

        public static void main (String[]args){
            Double x = 2.00;
            int n = -2;
            So s = new So();
            System.out.print(s.myPow(x,n));


        }
}


class Sn {
    private long Mod = 1000000007;
    public int myPow(int n) {
        // Handle the edge case where n is Integer.MIN_VALUE
        long even=(n+1)/2;
        long odd=n/2;
        long first=recursivePow(5,even)%Mod;
        long second=recursivePow(4,odd)%Mod;
        long N = n;
//
        return (int)((first*second));
    }

    private long recursivePow(long x, long n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: reduce the exponent by half
        long half = recursivePow(x, n / 2);
        if (n % 2 == 0) {
            return half*half;

        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        Sn sol = new Sn();
//        double x = 2.00;
        int n = 50;
        System.out.println(sol.myPow(n)); // Expected output: 0.0


    }
}

class Solu {
    public int countGoodNumbers(long n) {
        long cnt = 1; // Initialize cnt to 5, not 1
        while (n > 0) {
//            if(n==0){
//                cnt=1;
//            }
            if (n % 2 == 0) {
                cnt = (cnt * 5);
                n=n+1/2;// Multiply by 5 and take modulo
            } else {
                cnt = (cnt * 4);
                n = n / 2;// Multiply by 4 and take modulo
            }

        }
        return (int) cnt;
    }

    public static void main(String[] args) {
        long n = 0;
        Solu s = new Solu();
        System.out.print(s.countGoodNumbers(n));
            }
}
