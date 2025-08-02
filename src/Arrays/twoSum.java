package Arrays;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // optimized version with hashmap :


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums,29);
        System.out.println(Arrays.toString(ans));
    }
}
