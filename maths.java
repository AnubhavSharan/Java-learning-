import java.util.*;

public class maths {
    static int gcd(int a, int b){
        int result=Math.min(a, b);
        while(result!=0){
            if(result!=0 && a%result==0 && b%result==0){
                break;
            }
            result--;
        }
        return result;
    }

    static int lcm(int a, int b){
        int lcm = (a * b)/gcd(a,b);
        return lcm;


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        System.out.println("GCD of "+a+" and "+b +": "+gcd(a,b));
        
        System.out.println("LCM of "+a+" and "+b +": "+lcm(a,b));


    }
}


// solved using recursion
// class Solution {
//     static Long gcd(Long c,Long d){
//         if (c==0){
//             return d;
//         } if (d==0){
//             return c;
//         }
//         if (c==d){
//             return c;
//         }
//         if (c>d){
//             return gcd(c-d,d);
        
//         }else{
//             return gcd(c,d-c);
//         }
//     }

    
//     static Long[] lcmAndGcd(Long A ,Long B) {
//         Long[] arr = new Long[2];
        
//         arr[1]=gcd(A,B);

//         Long lcm = (A*B)/arr[1];
//         arr[0]=lcm;

//         return arr;
    

//         }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Long a=sc.nextLong();
//         Long b=sc.nextLong();

//         System.out.println(lcmAndGcd(a, b));

//     }
//     }

class Arm{
    static boolean armstring(int a){
        int n = String.valueOf(a).length();
        int b = a;
        
        int cnt = 0;

        while(b != 0){
            int digit = b % 10;
            cnt = cnt +(int) Math.pow(digit,n);
            b = b/10;
        }
        if (a==cnt){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] argd){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(armstring(a));
         

    }
}
    