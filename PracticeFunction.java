import java.util.*;
public class PracticeFunction {
    public static boolean Prime(int n){
        int cnt=0;
        for(int i=1; i<=Math.sqrt(n);i++){
            if(n%i==0){
                cnt++;
                if(n/i!=i){
                    cnt++;
                }
            }
            
        }

        if (cnt==2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();

        boolean isPrime = Prime(a);

        if(isPrime){
            System.out.print("the number is a prime number");
        }else{
            System.out.print("the number is not a prime number");
        }

        
    }

}

class ques2{
    public static boolean EvenNumer(int n){
        return n%2==0;

    }
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int a = m.nextInt();

        boolean isEven=EvenNumer(a);
        
        if(isEven){
            System.out.println("the number is a even number");
        }else{
            System.out.println("the number is Odd number");
        }
    }
}

class Ques3{
    public static void Table(int n){
        for(int i=1; i<=10;i++){
            System.out.println(n * i);
            
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Table(a);
    }
}