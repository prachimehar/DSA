package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class firstAndLastPositionIanArray {
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
    public static int[] searchRange(int[] nums, int target) {
        int lb = lowerBoundByBS(nums,target);
        if (lb == nums.length || nums[lb] != target) return new int[]{-1, -1};
        return  new int[]{lb,upperBoundByBS(nums,target)-1};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] newAns = searchRange(nums,target);
        System.out.println(Arrays.toString(newAns));

    }
}
