import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if (a > b) {
            System.out.println("a is greater then b");
        } else if(a==b) {
            System.out.println("Both a and b are equal");
        } 
        else {
            System.out.println("b is greater than a");
        }

    }
}
class SwitchCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int button=scanner.nextInt();
        
        switch (button) {
            case 1: System.out.println("Hello");
            break;

            case 2: System.out.println("Namaste");
            break;

            case 3: System.out.println("bhagja");
            break;

            default: System.out.println("you have provided the wrong input");
            break;
        }


    }
}
