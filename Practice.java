import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("1. Enter sum for addition\n2. Enter sub for subtraction\n3. Enter multi for multiplication\n4. Enter mod for modulus\n5. Enter div for division");
        String c = sc.next();
        if (c.equals("sum")) {
            System.out.println(a+b);
        } else if(c.equals("sub")) {
            System.out.println(a-b);
        } else if (c.equals("multi")) {
            System.out.println(a*b);
        } else if (c.equals("mod")) {
            if (b!=0){
                System.out.println(a%b);
            }
        }else if (c.equals("div")) {
            if (b!=0){
            System.out.println(a/b);
            }
        }else {
            System.out.println("operation not present and cannot be performed");
        }


    }
}

class PracticeA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("1. Enter 1 for addition\n2. Enter 2 for subtraction\n3. Enter 3 for multiplication\n4. Enter 4 for modulus\n5. Enter 5 for division");
        int c = sc.nextInt();
        switch (c) {
            case 1: System.out.println(a+b);                
            break;

            case 2: System.out.println(a-b);                
            break;

            case 3: System.out.println(a*b);                
            break;

            case 4: System.out.println(a%b);                
            break;

            case 5: System.out.println(a/b);                
            break;

            default: System.out.println("Please enter the valid input");
            break;
        }
        
    }
}