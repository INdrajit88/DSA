public class binarySearch {
    public static void main(String[] args) {
        int [] arr={2,4,5,6,7,9,12,14,16,24,26,34,54,65,67,87,89,121};
        int target=121     ;
        int ans=Binary(arr,target);
        System.out.println(ans);
    }
    static int Binary(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+((end-start)/2);
            if (target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
