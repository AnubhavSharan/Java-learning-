// Sum of First n Numbers
import java.util.*;
public class PracticeLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n;i=i+1) {
            count=count + i;
        }
        System.out.println(count);
    }

}
// Table of n 
class Ques{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number whose table you want to print: ");
        int n = scanner.nextInt();
        for(int i=1; i<=10;i++) {
            System.out.println(n +"X"+ i + "="+ n*i);

        }
    }
} 
