package BinarySearch;

public class FindPeakElement {
    public static int findPeak(int[] arr){
        int n = arr.length;
        int l = 1, h = n-2;

        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        while(l <= h){
            int mid = l+(h-l)/2;
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid-1] < arr[mid]){
                //right
                l = mid + 1;
            }
            else{//left
                h = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {0,3,8,9,5,2};
        int ans = findPeak(arr);
        System.out.println(ans);

    }
}
