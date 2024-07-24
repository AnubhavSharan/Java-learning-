class rotate {

    public static void main(String[] arg) {
        int[] arr = { 1 };
        // System.out.println();
        len(arr);

    }

    static void len(int[] arr) {
        int k = 2;
        int n = arr.length;
        int c = k % n;

        int[] temp = new int[c];
        int j = 0;
        for (int i = n - c; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n - k; i++) {
            arr[n - i - 1] = arr[n - c - i - 1];
        }
        // int l = 0;
        for (int i = 0; i < c; i++) {
            arr[i] = temp[i];
            // l++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}

class ZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {0};
        int[] k = zero(arr);
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
        // System.out.println(zero(arr));
    }


    static int[] zero(int[] arr) {
//        int n = arr.length;
        int i = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                i = j;
                break;
            }
        }
            if (i == -1) {
                return arr;
            }

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;

            }
        }
        return arr;
    }

}