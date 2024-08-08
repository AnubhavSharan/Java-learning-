package Linked_list;

public class DecimalToBinary {
    public String ToBinary(int n){
        String remainder = "";
        while(n>0){
            int a = n%2;
            remainder += Integer.toString(a);
            n=n/2;
        }
        StringBuilder s = new StringBuilder(remainder);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        int a = 10;
        DecimalToBinary d = new DecimalToBinary();
        System.out.print(d.ToBinary(a));
    }
}

class BinaryToDecimal{
    static int ToDecimal(String s){
        double cnt=0;
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        for(int i=0;i<s.length();i++){
            char c = s1.charAt(i);
            cnt += Character.getNumericValue(c)*Math.pow(2,i);
        }
     return (int) cnt;
    }

    public static void main(String[] args) {
        String s = "111";
        System.out.print(ToDecimal(s));
    }
}