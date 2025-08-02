package BinarySearch;

public class peakIndexInMountainArray {
    public int peakIndexInMountain(int[] arr) {
        int n = arr.length;
        int l = 1, h = n-2;
        while(l<=h){
            int mid = l+(h-l)/2;

            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(arr[mid-1]<arr[mid]){ // right
                l = mid+1;
            }
            else{ // left
                h = mid -1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
