import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {-1,0,5};
        int val=-1;
        System.out.print(Search(arr,val));

}
static int Search(int[] arr,int val){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        for(int i=start; i<=end; i++){

            mid = (start + end)/2;
            if(arr[mid]<val){
                if(val==arr[end]){
                    return end;
                }
                start=mid+1;


            }else if(arr[mid]==val){
                return mid;
            }else{
                if(val==arr[start]){
                return start;
                }
                end=mid-1;

            }

        }
         return -1;
}
}

class FloorInArray{
    public static void main(String[] args){
        long[] arr = {1,6,8,9};
        long x=4;
        System.out.print(Floor(arr,x));


    }
    static int Floor(long[] arr,long x){
        long max = 0;
        boolean a=true;
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                max = arr[i];
                ind=i;
                a=false;
            }

            }
        if(a) {
            return -1;
        }else {
            return ind;
        }
    }
}
