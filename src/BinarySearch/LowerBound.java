package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,24};
        int target = 6;
        int ans = lowerBoundByBS(arr,target);
        System.out.println(ans);
    }
    public static int lowerBoundByBS(int[] arr, int target) {

        int l =0, h = arr.length-1;
        int ans = arr.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>= target){
                    ans = mid;
                    h = mid - 1;
            }
            else{
                    l = mid + 1;
            }
        }
        return ans;
    }
}
