#include<stdio.h>
int binarySearch(int arr[],int target){
    int start=0;
    int end= 9;
    while(start<=end){
        int mid=start+((end-start)/2);
        if(target>arr[mid]){
        start=mid+1;
        }
        else if(target<arr[mid]){
        end=mid-1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
int main(){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int target=5;
    int ans=binarySearch(arr,target);
    printf("%d",ans);
    return 0;
}