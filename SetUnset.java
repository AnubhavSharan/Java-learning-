package BitManipulation;

public class SetUnset {
    public static void main(String[] args) {
        int n  = 15;
        int mask = n|n+1;
        System.out.print(mask);
    }
}

class Count1{
    public static int ans(int n){
        int a = 0;
        int cnt=0;
        for(int i =1;i<=n;i++){
            cnt+=Integer.bitCount(i);
        }
        return cnt;

    }
    static int new_ans(int n){
    int cnt=0;
        while(n!=0){
        n=n&(n-1);
        cnt++;
    }
        return cnt;
    }
    public static void main(String[] args) {
        int n = 74839200;
        System.out.print(ans(n));
    }
}