package BitManipulation;

public class NewBit {
    public static void main(String[] args) {
        int n = 8;
        int Bit_mask = 1<<0;
        if((n & Bit_mask)==1){
            System.out.print("the last number is 1");
        }else if((n & Bit_mask)==0){
            System.out.print("the last number is 0");

        }
    }
}

class NewBit1 {
    public static void main(String[] args) {
        int n = 8;
        int Bit_mask = 1<<0;
        int ans = n | Bit_mask;
        System.out.print(ans);
    }
}
class Solution {
    static void bitManipulation(int num, int i) {
        // code here
        int n =num;
        int pos=i-1;
        int bit = 1<<pos;
        int val;
        if ((n & bit) == 0) {
            val=0;
        }else {
            val = 1;
        }
        int set = n | bit;
        int clear = n & ~bit;
        System.out.print(clear+" "+set);
//        if(clear>set){
//            System.out.print(val+" "+clear+" "+set);
//        }else{
//            System.out.print(val+" "+set+" "+clear);
//        }
    }

    public static void main(String[] args) {
        int n =8;
        int i =1;
        bitManipulation(n,i);
    }
}

class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int mask = 1<<k;
        if ((n & mask) ==0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int n =10;
        int k = 3;
        System.out.print(checkKthBit(n,k));
    }

}