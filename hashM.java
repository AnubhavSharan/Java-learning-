import java.util.*;

public class hashM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }
        // int q;
        // q=sc.nextInt();
        // while(q-- !=0){
        // int num=sc.nextInt();
        for (int val : hash) {
            System.out.print(val + " ");
        }
    }

}

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 3, 5, 5 };
        int n = 5;
        int p = 5;

        frequencyCount(arr, n, p);

    }

    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        int[] hash;
        if (N > P) {

            hash = new int[N + 1];
        } else if (N == P) {
            hash = new int[N + 1];
        } else {
            hash = new int[P + 1];

        }

        for (int i = 0; i < N; i++) {
            hash[arr[i]] += 1;
        }

        for (int i = 0; i < N; i++) {
            arr[i] = hash[i + 1];
            // System.out.print(arr[i]+" ");

        }
    }
}

class Solution1 {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };

        frequencyCount(arr);

    }

    static void frequencyCount(int arr[]) {
        int l = arr.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < l; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // int min=n;
        int max = 0, min = arr[0];
        int maxele = 0, minele = 0;

        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            int element = it.getKey();
            int count = it.getValue();
            if (count > max) {
                max = count;
                maxele = element;
            }
            if (count < min) {
                min = count;
                minele = element;
            }
        }
        System.out.print(maxele + " ");
        System.out.println(max);
        System.out.print(minele + " ");
        System.out.println(min);
    }
}
