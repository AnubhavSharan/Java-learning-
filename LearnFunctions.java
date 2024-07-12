import java.util.*;
// Addition
public class LearnFunctions {
    public static int AddTwoNumber(int a, int b){
        int c = a+b;
        return c;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = AddTwoNumber(a, b);
        System.out.println("the sum of two numbers are: "+sum);
    }

}
// Multiplication
class PracticeCode{
    public static int MultiNum(int a,int b){
        return a*b;
    } 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

       
        System.out.println("the Multiplication of a and b is: "+ MultiNum(a, b));
    }
}

// Factorial
class LearnFactorial{
    public static int Factorial(int a){
        if (a<0){
            return -1;// -1 here stands for invalid input
        } else if(a==0){
            return 1;
        }else{

        int factorial=1;
        for(int i=a; i>=1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }

    }
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        int a = m.nextInt();

        System.out.println(Factorial(a));

    }
}