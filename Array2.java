// checking array is sorted or not
public class Array2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int cnt = 0;
        int n = arr.length;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] > arr[i]) {
                cnt++;

            }

        }
        if (arr[n - 1] > arr[0]) {
            cnt++;
        }
        System.out.println(cnt);
    }

}

// giving out unique elements in array but this is not a good way just used it
// to understand the manupulaton of array according to the need
class Array {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4 };
        int cnt = 0;
        int n = arr.length;
        int effectiveLength = n; // Tracks the effective length as elements are moved to the end

        for (int i = 1; i < effectiveLength; i++) {
            if (arr[i - 1] == arr[i]) {
                cnt += 1;
                int temp = arr[i];
                // Move the element to the end
                for (int j = i; j < effectiveLength - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[effectiveLength - 1] = temp;
                effectiveLength--; // Decrease effective length
                i--; // Stay on the same index for the next iteration
            } else if (arr[i - 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                if (i > 1) {
                    i -= 2; // Go back to check the previous pair again
                } else {
                    i = 0; // Ensure we don't go out of bounds
                }
            }
        }

        // Print the modified array
        int b = n - cnt;
        int[] arr1 = new int[b];
        for (int i = 0; i < b; i++) {
            arr1[i] = arr[i];
            System.out.println(arr1[i]);
        }

    }
}
