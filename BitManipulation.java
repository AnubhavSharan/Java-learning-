package BitManipulation;
//replacing i th index if 1 then 0 and vice versa and finding the output after making the change
public class BitManipulation {
    static void Manipulation(int n, int i){
        StringBuilder a = new StringBuilder(BitCon(n));
        char c = a.charAt(i-1);
        int change = 0;

//        if(c=='0'){
//            a.setCharAt(i-1,'1');
//            change = 0;
//        }
//         if(c=='1'){
//            a.setCharAt(i-1, '0');
//            change=1;
//        }
        int new_bit = DecimalCon(a.toString());
        System.out.print(a);
    }
    static String BitCon(int n){
        //bit conversion
        String s = "";
        while(n>0){
            int a = n%2;
            s+=Integer.toString(a);
            n/=2;
        }
        return s;


    }
    static int DecimalCon(String a){
        //Decimal conversion\
        int cnt = 0;
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            cnt+=Character.getNumericValue(c)*Math.pow(2, i);
        }
    return cnt;
    }

    public static void main(String[] args) {
        BitManipulation b= new BitManipulation();
        int n = 70;
        int i = 1;
        b.Manipulation(n,i);

    }
}
//bit manipulation with simple logic
