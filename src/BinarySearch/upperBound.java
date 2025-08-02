package BinarySearch;

public class upperBound {
    public static int upperBoundByBS(int[] arr, int target){
        int l = 0,h = arr.length-1;
        int ans = arr.length;

        while(l <= h){
            int mid = l+(h-l)/2;
            if(arr[mid] > target){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,8,15,19};
        int target = 5;

        int answer = upperBoundByBS(arr,target);
        System.out.println(answer);

    }
}
