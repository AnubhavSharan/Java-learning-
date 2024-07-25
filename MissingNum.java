import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int missing=Miss(arr);
        System.out.println(missing);

    }

    static int Miss(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i <= arr.length; i++) {
            map.put(i,0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
//        int a=0;
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == 0) {
                return it.getKey();
            }
        }

    return -1;

    }
}


