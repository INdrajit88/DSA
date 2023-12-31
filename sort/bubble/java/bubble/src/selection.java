import java.util.Arrays;

public class selection {

    public static void main(String[] args) {
        int[] arr={4,2,9,2,13,6};
        selection(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int last= arr.length - i - 1;
            int maxIndex=maxInd(arr,0,last);
            swap(arr, maxIndex,last);
        }
    }
    static int maxInd(int[] arr,int start,int end){
        int max=start;
        for (int i = start; i < end; i++) {
            if (arr[i]>arr[max]) {
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
