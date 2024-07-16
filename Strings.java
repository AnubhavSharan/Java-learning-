public class Strings{
    static boolean StringA(String n) {
        String a = n.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder reverse = new StringBuilder(a).reverse();
        return a.equals(reverse.toString());

    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        // StringA(a);
        System.out.println(StringA(a));
    }
}

//fibonacci using recursion

class fibo{
    static int Fibo(int n){
        int a =0;
        int b=1;
        // if(n==0 || n==1){
        //     return 1;
        // }
        return Fibo1(a,b,n);
        
    }
    static int Fibo1(int a,int b,int n){
        if(n==0){
            int sum = a+b;
            return sum;
        }
        int c=a+b;
        a=b;
        b=c;
        return Fibo1(a, b, n-1);

    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(Fibo(n));
    }
}


