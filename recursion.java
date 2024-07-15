import java.sql.Array;
import java.util.*;
public class recursion {
    //basic recursion
    static void rec(int a){
        if(a==0){
            return;
        }
        rec(a-1);
        System.out.println(a);   
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();

        rec(a);

    }

}

class Recursion1 {
    static int rec(int a){
        // int cnt=0;
        if(a==0){
            return 0;
        }
        // cnt=cnt+a;
        return a*a*a+rec(a-1);
        
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        
    
        System.out.println(rec(a));

    }
    
}
class Recursion2 {
    static int cnt=0;
    static void rec(int a){
        if(a==0){
            System.out.println(cnt*cnt);
            return;
    }else{
        cnt = cnt + a;
        rec(a-1);
    }
        
        
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    

    rec(a);

}
}
// all factorial numbers less than or equals to n;
class Sol{
    
    static ArrayList<Integer> recursion(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        giveFactorial(1,1,n,arr);
        return arr;
            
    }
     static void giveFactorial(int factorial,int num,int n,ArrayList<Integer> result){
        if(factorial>n){
            return;
        }
        result.add(factorial);
        giveFactorial(factorial*(num+1),num+1, n, result);
     }
    public static void main(String[] args) {
        int n=54;
        ArrayList<Integer> factorials = recursion(n);
        for (int factorial : factorials) {
            System.out.print(factorial+" ");

    }
    
}
}

class Sol1{
        static void revArray(int[] arr){
            // int[] arr1=new int[arr.length];
            int a=arr.length;
            int[] arr1 =new int[a];
            // int[] arr1 = new int[a];
            rev(a,arr,0,arr1,a-1);
            for(int i=0;i<a;i++){
            System.out.print(arr1[i]+" ");
        }
        }
        static void rev(int n,int[] arr,int i,int[] arr1,int num){
            if(i==n){
                return;
            }
            arr1[i]=arr[num];
            rev(n,arr,++i,arr1,++num);
        }        
     
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        revArray(arr);

        
        
    }
    }
    
