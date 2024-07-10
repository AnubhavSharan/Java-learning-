import java.util.*;
class FirstCode{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.print("My first java code\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String name = sc.next();
        System.out.print(name);
    }

}
class SecondCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        String name = sc.next();
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = scanner.nextInt();
        System.out.print("enter second number: ");
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.print("the output is: ");
        System.out.print(sum);
    }
}