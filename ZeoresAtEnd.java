import java.util.*;

public class ZeoresAtEnd {

        public static int[] zero(int[] arr) {
//            int n = arr.length;
            int j = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    j = i;
                    break;
                }
            }
                if (j == -1) {
                    return arr;
                }
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;

                }
            }
            return arr;
        }

    public static void main(String[] args) {
        int[] arr = {1, 0,1};
        int[] k = zero(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(k[i]+" ");
        }
    }

}


class Union{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
//        ArrayList<Integer> a= new ArrayList<>();
//        int[] arr3=new int[arr1.length+arr2.length];
        HashSet <Integer> Set = new HashSet();

        for(int i=0;i<arr1.length;i++){
            Set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){

            Set.add(arr2[i]);
        }
        for(int val:Set){
            System.out.print(val+" ");
        }
        ArrayList<Integer> a= new ArrayList<>(Set);
        Collections.sort(a);
    }
}
class Cons1{
    public static void main(String[] args){
        int[] arr1 = {1,1,0,1,1,1};
        max(arr1);

    }
    static void max(int[] arr){
        int cnt=0;
        int max_cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt+=1;
//                if(cnt>max_cnt){
//                max_cnt=cnt;
//            }
            }
            if(arr[i]==0) {
                if(cnt>max_cnt){
                    max_cnt=cnt;
                }
            cnt=0;
        }
        }
        System.out.println(max_cnt);
    }
}

class Single{
    public static void main(String[] args){
        int[] arr = {1,2,2,1,2,3};
        System.out.println(lin(arr));
    }

    static int lin(int[] arr){
        HashMap <Integer, Integer> map = new HashMap<>();


        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
            }

        return -1;
    }
}

class MaxCount{
    public static void main(String[] args) {
        int[] arr = {-1,2,3};
        int k = 6;
        System.out.print(max(arr,k));
    }
    static int max(int[] arr,int k){
        int max_cnt=0;
        int cnt=0;
        int sum=0;
        int i=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[i]+arr[j];
            cnt+=1;

            if(sum==k){
                max_cnt=Math.max(max_cnt,cnt);
                sum=0;
                cnt=0;
                i++;
            }
        }
        return max_cnt;
    }
}


