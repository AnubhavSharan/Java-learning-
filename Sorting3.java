public class Sorting3 {
    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 1, 4, 6, 10 };

        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;

            }

        }
        Insertion(arr);

    }

}
