// shifting just one times 
public class arShift {

    public static void rev(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rev(arr);
    }

}

// shifting array k times
class cw1 {

    public static void rev(int[] arr) {
        int n = arr.length;
        int k = arr.length - 1;

        for (int i = 0; i < n; i++) {
            int temp = arr[n - 1];
            for (int j = 0; j < n - 1; j++) {
                arr[n - j - 1] = arr[n - j - 2];

            }
            arr[0] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        rev(arr);
    }

}
