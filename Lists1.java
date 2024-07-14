import java.util.*;
class Lists {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] arr = new int[size];

        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}


class Lists1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String [] arr = new String[size];

        for(int i=0; i<size;i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class Find{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();            

        }
        int max = 0;
        int min=arr[0];
        for(int i =0; i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
        
    }
}