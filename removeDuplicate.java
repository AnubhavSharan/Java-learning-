
import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;

            }
        }
        return i + 1;
    }
}

class removeduplicate1 {
    static void duplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];

            arr[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

        // HashSet<Integer> hash = new HashSet<>();
        // for(int i=0;i<hash.size();i++){
        // hash.add(arr[i]);
        // }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        duplicate(arr);

    }

}
